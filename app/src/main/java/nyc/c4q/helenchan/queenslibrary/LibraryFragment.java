package nyc.c4q.helenchan.queenslibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.helenchan.queenslibrary.network.LibraryService;
import nyc.c4q.helenchan.queenslibrary.network.QueensLibraryResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by helenchan on 12/27/16.
 */
public class LibraryFragment extends Fragment {

    View mRoot;
    RecyclerView recyclerView;
    LibraryAdapter adapter;
    List<QueensLibraryResponse> libraryList = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.library_fragment, container, false);
        recyclerView = (RecyclerView) mRoot.findViewById(R.id.fragment_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(mRoot.getContext()));
        adapter = new LibraryAdapter(libraryList);
        recyclerView.setAdapter(new LibraryAdapter(libraryList));
        return mRoot;
    }

    @Override
    public void onStart() {
        super.onStart();
        fetchLibrary();
    }

    private void fetchLibrary() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.cityofnewyork.us/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LibraryService service = retrofit.create(LibraryService.class);
        Call<List<QueensLibraryResponse>> call = service.getLibraries();
        call.enqueue(new Callback<List<QueensLibraryResponse>>() {
            @Override
            public void onResponse(Call<List<QueensLibraryResponse>> call, Response<List<QueensLibraryResponse>> response) {
                libraryList = response.body();
                adapter = new LibraryAdapter(libraryList);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<QueensLibraryResponse>> call, Throwable t) {
                Toast.makeText(getContext(), "Error Downloading", Toast.LENGTH_LONG);
            }

        });

    }
}
