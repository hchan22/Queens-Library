package nyc.c4q.helenchan.queenslibrary.network;

/**
 * Created by helenchan on 12/27/16.
 * <p>
 * [{
 * ":@computed_region_92fq_4b7q": "33",
 * ":@computed_region_efsh_h5xi": "16863",
 * ":@computed_region_f5dn_yrer": "39",
 * ":@computed_region_sbqj_enih": "72",
 * ":@computed_region_yeji_bk3q": "3",
 * "fr": "closed",
 * "location_1": {
 * "type": "Point",
 * "coordinates": [-73.9316632529567, 40.761699790013324]
 * },
 * "location_1_city": "LIC",
 * "location_1_location": "35 32 21 St",
 * "location_1_state": "NY",
 * "location_1_zip": "11106",
 * "mn": "closed",
 * "name": "Ravenswood",
 * "phone": "By apptmt only",
 * "sa": "closed",
 * "su": "closed",
 * "th": "closed",
 * "tu": "closed",
 * "we": "closed"
 * }, {
 */

public class QueensLibraryResponse {

    private String location_1_city;
    private String location_1_location;
    private String location_1_state;
    private String location_1_zip;
    private String name;
    private String phone;

    public String getLocation_1_city() {
        return location_1_city;
    }

    public String getLocation_1_location() {
        return location_1_location;
    }

    public String getLocation_1_state() {
        return location_1_state;
    }

    public String getLocation_1_zip() {
        return location_1_zip;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
