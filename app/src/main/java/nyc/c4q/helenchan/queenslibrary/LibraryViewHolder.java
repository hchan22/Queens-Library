package nyc.c4q.helenchan.queenslibrary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.helenchan.queenslibrary.network.QueensLibraryResponse;

/**
 * Created by helenchan on 12/27/16.
 */
public class LibraryViewHolder extends RecyclerView.ViewHolder{
    TextView nameTextView;
    TextView locationTextView;
    TextView locationZipTV;
    TextView phone_tv;

    public LibraryViewHolder(View itemView) {
        super(itemView);
        nameTextView = (TextView)itemView.findViewById(R.id.name_tv);
        locationTextView= (TextView)itemView.findViewById(R.id.location_tv);
        locationZipTV = (TextView)itemView.findViewById(R.id.location2);
        phone_tv = (TextView) itemView.findViewById(R.id.phone_tv);
    }

    public void bind(QueensLibraryResponse myLibraries) {
//        for(int i = 0; i < myLibraries.size(); i++) {
            nameTextView.setText(myLibraries.getName());
            locationTextView.setText(myLibraries.getLocation_1_location());
            locationZipTV.setText(myLibraries.getLocation_1_city() + " " + myLibraries.getLocation_1_state() + "," + " " + myLibraries.getLocation_1_zip());
            phone_tv.setText(myLibraries.getPhone());
//        }
    }
}
