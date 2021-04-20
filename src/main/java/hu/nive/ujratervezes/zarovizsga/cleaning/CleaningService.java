package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    private List<Cleanable> cleanables = new ArrayList<>();

    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        int sum = 0;
        for (Cleanable currentAddress : cleanables){
            sum+= currentAddress.clean();
        }
        cleanables.clear();
        return sum;
    }

    public int cleanOnlyOffices(){
        int sum = 0;
        for (int i = cleanables.size() -1; i>=0; i--){
            if (cleanables.get(i) instanceof Office){
                sum+= cleanables.get(i).clean();
                cleanables.remove(cleanables.get(i));
            }
        }
        return sum;
    }

    public List<Cleanable> findByAddressPart(String address){
        List<Cleanable> solution = new ArrayList<>();
        for (Cleanable currentAddress: cleanables){
            if (currentAddress.getAddress().contains(address)){
                solution.add(currentAddress);
            }
        }
        return solution;
    }

    public String getAddresses() {
        if (cleanables.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Cleanable currentAddress : cleanables){
            sb.append(currentAddress.getAddress());
            sb.append(", ");
        }
        sb.delete((sb.length()-2),sb.length());
        return sb.toString();
    }

}
