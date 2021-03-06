package nyc.c4q.helenchan.queenslibrary;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.helenchan.queenslibrary.network.QueensLibraryResponse;

/**
 * Created by helenchan on 12/27/16.
 */
public class LibraryAdapter extends RecyclerView.Adapter<LibraryViewHolder> {

    List<QueensLibraryResponse> libraryList = new ArrayList<>();


    public LibraryAdapter(List<QueensLibraryResponse> libraryList) {
        this.libraryList = libraryList;
    }

    @Override
    public LibraryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.library_itemview, parent, false);
        return new LibraryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LibraryViewHolder holder, int position) {
        QueensLibraryResponse myLibraries = libraryList.get(position);
        holder.bind(myLibraries);
    }

    @Override
    public int getItemCount() {
        return libraryList.size();
    }
}
