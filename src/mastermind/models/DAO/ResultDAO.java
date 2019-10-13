package mastermind.models.DAO;

import mastermind.models.Result;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResultDAO implements DAO {

    private Result result;

    ResultDAO(Result result) {
        this.result = result;
    }
    @Override
    public void save(FileWriter fileWriter) {
        try {
            fileWriter.write(this.result.getBlacks() + "-" + this.result.getWhites() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(BufferedReader bufferedReader) {
        try {
            String[] result = bufferedReader.readLine().split("-");
            this.result.setBlacks(Integer.parseInt(result[0]));
            this.result.setWhites(Integer.parseInt(result[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
