package yuntech.b10517012.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String test = "Test";
    int tr = 0 ;
    String test2 = "測試 Reset";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void testMaster() {
        Log.d("test","測試 master 功能");
    }
    void testBranch() {
        Log.d("test","測試分支功能");
    }
}
