package com.example.cs4084project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 6, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/example/cs4084project/Filter;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CS4084_Project.app"}
)
public final class Filter extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_filter);
        View var10000 = this.findViewById(R.id.filterCancelBtn);
        Intrinsics.checkNotNullExpressionValue(var10000, "findViewById (R.id.filterCancelBtn)");
        Button filterCancelBtn = (Button)var10000;
        filterCancelBtn.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)Filter.this, UpcomingLifts.class);
                Filter.this.startActivity(intent);
            }
        }));
    }
}