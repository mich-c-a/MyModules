package sg.edu.rp.c346.id21025446.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DesignActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);

        tvAnswer = findViewById(R.id.textViewModDeets);
        Intent intentReceived = getIntent();
        String MC = intentReceived.getStringExtra("ModuleCode");
        String MN = intentReceived.getStringExtra("ModuleName");
        String AY = intentReceived.getStringExtra("AcademicYear");
        String Sem = intentReceived.getStringExtra("Semester");
        String MCT = intentReceived.getStringExtra("ModuleCredit");
        String venue = intentReceived.getStringExtra("Venue");
        tvAnswer.setText("Module Code: " + MC + "\nModule Name: " + MN + "\nAcademic Year: " + AY
                + "\nSemester: " + Sem + "\nModule Credit: " + MCT + "\nVenue: " + venue);
    }
}