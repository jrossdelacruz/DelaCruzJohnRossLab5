package johnross.delacruz.com.delacruzjohnrosslab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyBackgroundService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i=null, chooser=null;

        if(v.getId() == R.id.btnAct2) {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);

            Log.d("Activity 1", "Activity 2 BUTTON was pressed.");
        } else if(v.getId() == R.id.btnMap1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 25.730243, 78.953955"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);

            Log.d("Activity 1", "Map BUTTON was pressed.");
        }
    }
}
