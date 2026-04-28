package kr.hs.bsis.helloworld08.bsis2033;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kr.hs.bsis.helloworld08.bsis2033.Story;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "optionButtons", BuildConfig.FLAVOR, "Landroid/widget/Button;", "getOptionButtons", "()Ljava/util/List;", "optionButtons$delegate", "Lkotlin/Lazy;", "player", "Lkr/hs/bsis/helloworld08/bsis2033/Player;", "getPlayer", "()Lkr/hs/bsis/helloworld08/bsis2033/Player;", "endGame", BuildConfig.FLAVOR, "endingType", BuildConfig.FLAVOR, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "progressStory", "story", "Lkr/hs/bsis/helloworld08/bsis2033/Story;", "updatePlayerStatus", "app_release"}, k = 1, mv = {1, 1, 15})
public final class MainActivity extends AppCompatActivity {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MainActivity.class), "optionButtons", "getOptionButtons()Ljava/util/List;"))};
    private HashMap _$_findViewCache;

    /* JADX INFO: renamed from: optionButtons$delegate, reason: from kotlin metadata */
    private final Lazy optionButtons = LazyKt.lazy(new Function0<List<? extends Button>>() { // from class: kr.hs.bsis.helloworld08.bsis2033.MainActivity$optionButtons$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Button> invoke() {
            return CollectionsKt.listOf((Object[]) new Button[]{(Button) this.this$0._$_findCachedViewById(R.id.optionButton1), (Button) this.this$0._$_findCachedViewById(R.id.optionButton2), (Button) this.this$0._$_findCachedViewById(R.id.optionButton3), (Button) this.this$0._$_findCachedViewById(R.id.optionButton4)});
        }
    });
    private final Player player = new Player(0);

    private final List<Button> getOptionButtons() {
        Lazy lazy = this.optionButtons;
        KProperty kProperty = $$delegatedProperties[0];
        return (List) lazy.getValue();
    }

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

    public final Player getPlayer() {
        return this.player;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) _$_findCachedViewById(R.id.toolBar));
        ((Button) _$_findCachedViewById(R.id.returnButton)).setOnClickListener(new View.OnClickListener() { // from class: kr.hs.bsis.helloworld08.bsis2033.MainActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, (Class<?>) TitleActivity.class);
                intent.setFlags(67108864);
                MainActivity.this.startActivity(intent);
            }
        });
        ((Button) _$_findCachedViewById(R.id.drawerButton)).setOnClickListener(new View.OnClickListener() { // from class: kr.hs.bsis.helloworld08.bsis2033.MainActivity.onCreate.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((DrawerLayout) MainActivity.this._$_findCachedViewById(R.id.drawerLayout)).openDrawer(GravityCompat.END);
            }
        });
        ((DrawerLayout) _$_findCachedViewById(R.id.drawerLayout)).addDrawerListener(new ActionBarDrawerToggle(this, (DrawerLayout) _$_findCachedViewById(R.id.drawerLayout), (Toolbar) _$_findCachedViewById(R.id.toolBar), R.string.drawer_open, R.string.drawer_close));
        TextView storyView = (TextView) _$_findCachedViewById(R.id.storyView);
        Intrinsics.checkExpressionValueIsNotNull(storyView, "storyView");
        storyView.setMovementMethod(new ScrollingMovementMethod());
        TextView probsView = (TextView) _$_findCachedViewById(R.id.probsView);
        Intrinsics.checkExpressionValueIsNotNull(probsView, "probsView");
        probsView.setMovementMethod(new ScrollingMovementMethod());
        ProgressBar timeProgressBar = (ProgressBar) _$_findCachedViewById(R.id.timeProgressBar);
        Intrinsics.checkExpressionValueIsNotNull(timeProgressBar, "timeProgressBar");
        timeProgressBar.setMax(60);
        updatePlayerStatus();
        progressStory(StoryLine.INSTANCE.getStart());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlayerStatus() {
        if (this.player.getTimePassed() > 60) {
            endGame("게임오버");
        }
        int timePassed = this.player.getTimePassed() + 1020;
        TextView timeView = (TextView) _$_findCachedViewById(R.id.timeView);
        Intrinsics.checkExpressionValueIsNotNull(timeView, "timeView");
        timeView.setText(getString(R.string.time_format, new Object[]{Integer.valueOf(timePassed / 60), Integer.valueOf(timePassed % 60)}));
        ProgressBar timeProgressBar = (ProgressBar) _$_findCachedViewById(R.id.timeProgressBar);
        Intrinsics.checkExpressionValueIsNotNull(timeProgressBar, "timeProgressBar");
        timeProgressBar.setProgress(60 - this.player.getTimePassed());
        TextView probsView = (TextView) _$_findCachedViewById(R.id.probsView);
        Intrinsics.checkExpressionValueIsNotNull(probsView, "probsView");
        probsView.setText(this.player.getProbListByString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void progressStory(final Story story) {
        if (!Intrinsics.areEqual(story.getPlace(), BuildConfig.FLAVOR)) {
            TextView placeView = (TextView) _$_findCachedViewById(R.id.placeView);
            Intrinsics.checkExpressionValueIsNotNull(placeView, "placeView");
            placeView.setText(story.getPlace());
        }
        ((TextView) _$_findCachedViewById(R.id.storyView)).scrollTo(0, 0);
        TextView storyView = (TextView) _$_findCachedViewById(R.id.storyView);
        Intrinsics.checkExpressionValueIsNotNull(storyView, "storyView");
        storyView.setText(story.getText());
        for (Button button : getOptionButtons()) {
            final Story.Option option = story.get(getOptionButtons().indexOf(button));
            if (option != null) {
                boolean zIsProbExist = this.player.isProbExist(option.getNeed());
                Prob need = option.getNeed();
                if (need != null ? need.getCanBeDisable() : false) {
                    button.setTextColor(ContextCompat.getColor(this, zIsProbExist ? R.color.colorEnabled : R.color.colorDisabled));
                } else {
                    button.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                }
                button.setText(option.getText());
                button.setVisibility(0);
                button.setEnabled(zIsProbExist);
                final Story storyInvoke = option.getNext().invoke(this.player);
                if (StoryLine.INSTANCE.getGame_ending().keySet().contains(storyInvoke.getPlace())) {
                    button.setOnClickListener(new View.OnClickListener() { // from class: kr.hs.bsis.helloworld08.bsis2033.MainActivity$progressStory$$inlined$forEach$lambda$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.updatePlayerStatus();
                            this.endGame(storyInvoke.getPlace());
                        }
                    });
                } else {
                    button.setOnClickListener(new View.OnClickListener() { // from class: kr.hs.bsis.helloworld08.bsis2033.MainActivity$progressStory$$inlined$forEach$lambda$2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.getPlayer().useProb(option.getNeed());
                            this.getPlayer().addProb(option.getTakenProb());
                            this.updatePlayerStatus();
                            this.progressStory(storyInvoke);
                        }
                    });
                }
            } else {
                button.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGame(String endingType) {
        Intent intent = new Intent(this, (Class<?>) EndingActivity.class);
        intent.putExtra("endingType", endingType);
        startActivity(intent);
    }
}
