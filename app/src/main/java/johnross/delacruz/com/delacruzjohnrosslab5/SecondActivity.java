package johnross.delacruz.com.delacruzjohnrosslab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void process(View v) {
        Intent i=null, chooser=null;

        if(v.getId() == R.id.btnAct1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

            Log.d("Activity 2", "Activity 1 BUTTON was pressed.");
        } else if(v.getId() == R.id.btnMap2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.610199, 120.997781"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);

            Log.d("Activity 2", "Map BUTTON was pressed.");
        }
    }

}
