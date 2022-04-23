package com.example.cs4084project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/example/cs4084project/UpcomingLifts;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CS4084_Project.app"}
)
public final class UpcomingLifts extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_upcoming_lifts);
        View var10000 = this.findViewById(R.id.logoutBtn3);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById (R.id.logoutBtn3)");
        Button logoutBtn3 = (Button)var10000;
        logoutBtn3.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)UpcomingLifts.this, MainActivity.class);
                UpcomingLifts.this.startActivity(intent);
            }
        }));
        var10000 = this.findViewById(R.id.addLiftBtn);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById (R.id.addLiftBtn)");
        Button filterBtn = (Button)var10000;
        filterBtn.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)UpcomingLifts.this, Filter.class);
                UpcomingLifts.this.startActivity(intent);
            }
        }));
        String liftName = this.getIntent().getStringExtra("EXTRA_MESSAGE1");
        String fromLocation = this.getIntent().getStringExtra("EXTRA_MESSAGE2");
        String destination = this.getIntent().getStringExtra("EXTRA_MESSAGE3");
        String price = this.getIntent().getStringExtra("EXTRA_MESSAGE4");
        String seats = this.getIntent().getStringExtra("EXTRA_MESSAGE5");
        String date = this.getIntent().getStringExtra("EXTRA_MESSAGE6");
        String time = this.getIntent().getStringExtra("EXTRA_MESSAGE7");
        View var12 = this.findViewById(R.id.upcomingLiftName1);
        TextView textViewDestination = (TextView)var12;
        boolean var14 = false;
        textViewDestination.setText((CharSequence)liftName);
        TextView textViewLiftName = (TextView)var12;
        View var22 = this.findViewById(R.id.upcomingLiftFL1);
        TextView textViewPrice = (TextView)var22;
        boolean var15 = false;
        textViewPrice.setText((CharSequence)fromLocation);
        TextView textViewFL = (TextView)var22;
        View var24 = this.findViewById(R.id.upcomingLiftDest1);
        TextView textViewSeats = (TextView)var24;
        boolean var16 = false;
        textViewSeats.setText((CharSequence)destination);
        textViewDestination = (TextView)var24;
        View var26 = this.findViewById(R.id.upcomingLiftPrice1);
        TextView textViewDate = (TextView)var26;
        boolean var17 = false;
        textViewDate.setText((CharSequence)price);
        textViewPrice = (TextView)var26;
        View var28 = this.findViewById(R.id.upcomingLiftSeats1);
        TextView textViewTime = (TextView)var28;
        boolean var18 = false;
        textViewTime.setText((CharSequence)seats);
        textViewSeats = (TextView)var28;
        View var30 = this.findViewById(R.id.upcomingLiftDate1);
        TextView $this$apply = (TextView)var30;
        boolean var19 = false;
        $this$apply.setText((CharSequence)date);
        textViewDate = (TextView)var30;
        View var32 = this.findViewById(R.id.upcomingLiftTime1);
        $this$apply = (TextView)var32;
        boolean var20 = false;
        $this$apply.setText((CharSequence)time);
        textViewTime = (TextView)var32;
    }
}
