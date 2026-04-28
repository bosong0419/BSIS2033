package kr.hs.bsis.helloworld08.bsis2033;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kr.hs.bsis.helloworld08.bsis2033.Prob;

/* JADX INFO: compiled from: Player.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007R*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0019"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Player;", BuildConfig.FLAVOR, "_time", BuildConfig.FLAVOR, "(I)V", "<set-?>", BuildConfig.FLAVOR, "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "probs", "getProbs", "()Ljava/util/List;", "value", "timePassed", "getTimePassed", "()I", "setTimePassed", "addProb", BuildConfig.FLAVOR, "prob", "getProbListByString", BuildConfig.FLAVOR, "isProbExist", BuildConfig.FLAVOR, "find", "useProb", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Player {
    private List<Prob> probs = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
    private int timePassed;

    public Player(int i) {
        this.timePassed = i;
    }

    public final int getTimePassed() {
        return this.timePassed;
    }

    public final void setTimePassed(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.timePassed = i;
    }

    public final List<Prob> getProbs() {
        return this.probs;
    }

    public final void addProb(Prob prob) {
        if (prob instanceof Prob.TimePass) {
            setTimePassed(getTimePassed() + ((Prob.TimePass) prob).getTimePassed());
        } else {
            if (prob == null) {
                return;
            }
            this.probs.add(prob);
        }
    }

    public final void useProb(Prob prob) {
        if (prob instanceof Prob.Disposable) {
            this.probs.remove(prob);
        }
    }

    public final boolean isProbExist(Prob find) {
        if (find instanceof Prob.OptionPassed) {
            return !this.probs.contains(find);
        }
        if (find instanceof Prob.Condition) {
            return ((Prob.Condition) find).getCondition().invoke(this).booleanValue();
        }
        if (find == null) {
            return true;
        }
        return this.probs.contains(find);
    }

    public final String getProbListByString() {
        List<Prob> list = this.probs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Prob prob = (Prob) obj;
            if ((prob instanceof Prob.Normal) | (prob instanceof Prob.Disposable)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        String str = BuildConfig.FLAVOR;
        while (it.hasNext()) {
            str = str + ((Prob) it.next()).toString() + "\n";
        }
        return str;
    }
}
