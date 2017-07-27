package training.constraint.mcgee.constraintlayouttraining;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Exercise5 extends Activity {

    ImageButton roundImageButton;
    Button goneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);
        roundImageButton = (ImageButton)findViewById(R.id.imageButton);
        goneButton = (Button)findViewById(R.id.button3);
        roundImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (goneButton.isShown()) {
                    goneButton.setVisibility(View.GONE);
                } else {
                    goneButton.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
