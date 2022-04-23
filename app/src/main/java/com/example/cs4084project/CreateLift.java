package com.example.cs4084project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"},
        d2 = {"Lcom/example/cs4084project/CreateLift;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addLift", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "CS4084_Project.app"}
)
public final class CreateLift extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_create_lift);
        View var10000 = this.findViewById(R.id.addLiftCancelBtn);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById (R.id.addLiftCancelBtn)");
        Button addLiftCancelBtn = (Button)var10000;
        addLiftCancelBtn.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)CreateLift.this, MyLifts.class);
                CreateLift.this.startActivity(intent);
            }
        }));
        var10000 = this.findViewById(R.id.addLiftBtn2);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById(R.id.addLiftBtn2)");
        Button addLiftBtn = (Button)var10000;
        addLiftBtn.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                CreateLift.this.addLift();
            }
        }));
    }

    private final void addLift() {
        EditText liftNameInput = (EditText)this.findViewById(R.id.createLiftLiftNameInput);
        Intrinsics.checkNotNullExpressionValue(liftNameInput, "liftNameInput");
        String liftName = liftNameInput.getText().toString();
        EditText fromLocationInput = (EditText)this.findViewById(R.id.createLiftFLInput);
        Intrinsics.checkNotNullExpressionValue(fromLocationInput, "fromLocationInput");
        String fromLocation = fromLocationInput.getText().toString();
        EditText destinationInput = (EditText)this.findViewById(R.id.createLiftDestInput);
        Intrinsics.checkNotNullExpressionValue(destinationInput, "destinationInput");
        String destination = destinationInput.getText().toString();
        EditText priceInput = (EditText)this.findViewById(R.id.createLiftPriceInput);
        Intrinsics.checkNotNullExpressionValue(priceInput, "priceInput");
        String price = priceInput.getText().toString();
        EditText seatsInput = (EditText)this.findViewById(R.id.createLiftSeatsInput);
        Intrinsics.checkNotNullExpressionValue(seatsInput, "seatsInput");
        String seats = seatsInput.getText().toString();
        EditText dateInput = (EditText)this.findViewById(R.id.createLiftDateInput);
        Intrinsics.checkNotNullExpressionValue(dateInput, "dateInput");
        String date = dateInput.getText().toString();
        EditText timeInput = (EditText)this.findViewById(R.id.createLiftTimeInput);
        Intrinsics.checkNotNullExpressionValue(timeInput, "timeInput");
        String time = timeInput.getText().toString();
        Intent var16 = new Intent((Context)this, UpcomingLifts.class);
        boolean var18 = false;
        var16.putExtra("EXTRA_MESSAGE1", liftName);
        var16.putExtra("EXTRA_MESSAGE2", fromLocation);
        var16.putExtra("EXTRA_MESSAGE3", destination);
        var16.putExtra("EXTRA_MESSAGE4", price);
        var16.putExtra("EXTRA_MESSAGE5", seats);
        var16.putExtra("EXTRA_MESSAGE6", date);
        var16.putExtra("EXTRA_MESSAGE7", time);
        this.startActivity(var16);
    }
}
