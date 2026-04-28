package kr.hs.bsis.helloworld08.bsis2033;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EndingActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/EndingActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "onCreate", BuildConfig.FLAVOR, "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 1, 15})
public final class EndingActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        TextView resultView = (TextView) _$_findCachedViewById(R.id.resultView);
        Intrinsics.checkExpressionValueIsNotNull(resultView, "resultView");
        resultView.setMovementMethod(new ScrollingMovementMethod());
        String stringExtra = getIntent().getStringExtra("endingType");
        final Intent intent = new Intent(this, (Class<?>) TitleActivity.class);
        intent.setFlags(67108864);
        ((TextView) _$_findCachedViewById(R.id.resultView)).scrollTo(0, 0);
        TextView resultView2 = (TextView) _$_findCachedViewById(R.id.resultView);
        Intrinsics.checkExpressionValueIsNotNull(resultView2, "resultView");
        Story story = StoryLine.INSTANCE.getGame_ending().get(stringExtra);
        if (story == null) {
            Intrinsics.throwNpe();
        }
        resultView2.setText(story.getText());
        ((Button) _$_findCachedViewById(R.id.resultButton1)).setOnClickListener(new View.OnClickListener() { // from class: kr.hs.bsis.helloworld08.bsis2033.EndingActivity$onCreate$$inlined$apply$lambda$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.startActivity(intent);
            }
        });
    }
}
