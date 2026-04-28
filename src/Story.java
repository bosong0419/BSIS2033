package kr.hs.bsis.helloworld08.bsis2033;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kr.hs.bsis.helloworld08.bsis2033.Prob;

/* JADX INFO: compiled from: Story.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002J=\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00000\u0015H\u0086\u0002J1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Story;", BuildConfig.FLAVOR, "text", BuildConfig.FLAVOR, "place", "(Ljava/lang/String;Ljava/lang/String;)V", "options", BuildConfig.FLAVOR, "Lkr/hs/bsis/helloworld08/bsis2033/Story$Option;", "getPlace", "()Ljava/lang/String;", "getText", "get", "index", BuildConfig.FLAVOR, "set", BuildConfig.FLAVOR, "takenProb", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "need", "next", "Lkotlin/Function1;", "Lkr/hs/bsis/helloworld08/bsis2033/Player;", "Option", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Story {
    private final List<Option> options;
    private final String place;
    private final String text;

    public Story(String text, String place) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(place, "place");
        this.text = text;
        this.place = place;
        this.options = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
    }

    public /* synthetic */ Story(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2);
    }

    public final String getPlace() {
        return this.place;
    }

    public final String getText() {
        return this.text;
    }

    public static /* synthetic */ void set$default(Story story, String str, Prob prob, Prob prob2, Story story2, int i, Object obj) {
        if ((i & 2) != 0) {
            prob = (Prob) null;
        }
        if ((i & 4) != 0) {
            prob2 = (Prob) null;
        }
        story.set(str, prob, prob2, story2);
    }

    public final void set(String text, Prob takenProb, Prob need, Story next) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(next, "next");
        if (this.options.size() < 4) {
            List<Option> list = this.options;
            if (takenProb == null) {
                takenProb = new Prob.TimePass(0, 1, null);
            }
            list.add(new Option(text, takenProb, need, new Function1<Player, Story>() { // from class: kr.hs.bsis.helloworld08.bsis2033.Story.set.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Story invoke(Player it) {
                    Intrinsics.checkParameterIsNotNull(it, "it");
                    return Story.this;
                }
            }));
        }
    }

    public static /* synthetic */ void set$default(Story story, String str, Prob prob, Prob prob2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            prob = (Prob) null;
        }
        if ((i & 4) != 0) {
            prob2 = (Prob) null;
        }
        story.set(str, prob, prob2, (Function1<? super Player, Story>) function1);
    }

    public final void set(String text, Prob takenProb, Prob need, Function1<? super Player, Story> next) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(next, "next");
        if (this.options.size() < 4) {
            List<Option> list = this.options;
            if (takenProb == null) {
                takenProb = new Prob.TimePass(0, 1, null);
            }
            list.add(new Option(text, takenProb, need, next));
        }
    }

    public final Option get(int index) {
        return (Option) CollectionsKt.getOrNull(this.options, index);
    }

    /* JADX INFO: compiled from: Story.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Story$Option;", BuildConfig.FLAVOR, "text", BuildConfig.FLAVOR, "takenProb", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "need", "next", "Lkotlin/Function1;", "Lkr/hs/bsis/helloworld08/bsis2033/Player;", "Lkr/hs/bsis/helloworld08/bsis2033/Story;", "(Ljava/lang/String;Lkr/hs/bsis/helloworld08/bsis2033/Prob;Lkr/hs/bsis/helloworld08/bsis2033/Prob;Lkotlin/jvm/functions/Function1;)V", "getNeed", "()Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "getNext", "()Lkotlin/jvm/functions/Function1;", "getTakenProb", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "app_release"}, k = 1, mv = {1, 1, 15})
    public static final /* data */ class Option {
        private final Prob need;
        private final Function1<Player, Story> next;
        private final Prob takenProb;
        private final String text;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Option copy$default(Option option, String str, Prob prob, Prob prob2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = option.text;
            }
            if ((i & 2) != 0) {
                prob = option.takenProb;
            }
            if ((i & 4) != 0) {
                prob2 = option.need;
            }
            if ((i & 8) != 0) {
                function1 = option.next;
            }
            return option.copy(str, prob, prob2, function1);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Prob getTakenProb() {
            return this.takenProb;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Prob getNeed() {
            return this.need;
        }

        public final Function1<Player, Story> component4() {
            return this.next;
        }

        public final Option copy(String text, Prob takenProb, Prob need, Function1<? super Player, Story> next) {
            Intrinsics.checkParameterIsNotNull(text, "text");
            Intrinsics.checkParameterIsNotNull(takenProb, "takenProb");
            Intrinsics.checkParameterIsNotNull(next, "next");
            return new Option(text, takenProb, need, next);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(this.text, option.text) && Intrinsics.areEqual(this.takenProb, option.takenProb) && Intrinsics.areEqual(this.need, option.need) && Intrinsics.areEqual(this.next, option.next);
        }

        public int hashCode() {
            String str = this.text;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            Prob prob = this.takenProb;
            int iHashCode2 = (iHashCode + (prob != null ? prob.hashCode() : 0)) * 31;
            Prob prob2 = this.need;
            int iHashCode3 = (iHashCode2 + (prob2 != null ? prob2.hashCode() : 0)) * 31;
            Function1<Player, Story> function1 = this.next;
            return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
        }

        public String toString() {
            return "Option(text=" + this.text + ", takenProb=" + this.takenProb + ", need=" + this.need + ", next=" + this.next + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Option(String text, Prob takenProb, Prob prob, Function1<? super Player, Story> next) {
            Intrinsics.checkParameterIsNotNull(text, "text");
            Intrinsics.checkParameterIsNotNull(takenProb, "takenProb");
            Intrinsics.checkParameterIsNotNull(next, "next");
            this.text = text;
            this.takenProb = takenProb;
            this.need = prob;
            this.next = next;
        }

        public final Prob getNeed() {
            return this.need;
        }

        public final Function1<Player, Story> getNext() {
            return this.next;
        }

        public final Prob getTakenProb() {
            return this.takenProb;
        }

        public final String getText() {
            return this.text;
        }
    }
}
