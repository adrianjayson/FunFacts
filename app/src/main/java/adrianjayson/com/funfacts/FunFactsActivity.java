package adrianjayson.com.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    //Declare view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the Views from the layout file to the corresponding variables
        this.factTextView = (TextView) findViewById(R.id.factTextView);
        this.showFactButton = (Button) findViewById(R.id.showFactButton);
        this.relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();
                int color = colorWheel.getColor();

                // update screen with new fact
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        this.showFactButton.setOnClickListener(listener);

//        Toast.makeText(this, "Yay! Our activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate method.");
    }
}
