package lab_5;

import java.io.*;

public class FileManager {

    public void writeToFileString(Model model, String filename){
        try {
          	Flat []flats = model.getFlats();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filename),
                    "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (int i = 0; i < model.getQuantity(); i ++ ) {
            	String flatString =
                        flats[i].getNumber() + ", " +
                                flats[i].getSquare() + ", " +
                                flats[i].getFloor() + ", " +
                                flats[i].getRooms() + ", " +
                                flats[i].getType().toString() + ", " +
                                flats[i].getLifespan() + ", ";
                bufferedWriter.write(flatString);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e){
            e.getMessage();
          }
    }

    public Model readFromFileString(String filename){
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename),
                    "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            Model FlatForReturn = new Model();
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(", ");
                Flat flat = new Flat(Integer.valueOf(values[0]), Integer.valueOf(values[1]), Integer.valueOf(values[2]),
                		Integer.valueOf(values[3]),
                        Type.valueOf(values[4]),  Integer.valueOf(values[5]));
                FlatForReturn.add(flat);
            }
            return FlatForReturn;
        } catch (IOException e){
            e.getMessage();
            return new Model();
        }
    }

    public void writeToFileSerializableObjects(Model model, String filename){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(model);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e){
            e.getMessage();
        }
    }

    public Model readFromSerializableObjects(String filename){
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Model) objectInputStream.readObject();
        } catch (Exception e){
            e.getMessage();
            return new Model();
        }
    }
}
