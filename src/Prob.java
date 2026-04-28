package kr.hs.bsis.helloworld08.bsis2033;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Prob.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H¦\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "canBeDisable", BuildConfig.FLAVOR, "getCanBeDisable", "()Z", "getName", "()Ljava/lang/String;", "equals", "other", "toString", "Condition", "Disposable", "Normal", "OptionPassed", "TimePass", "Lkr/hs/bsis/helloworld08/bsis2033/Prob$TimePass;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob$OptionPassed;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob$Condition;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob$Disposable;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob$Normal;", "app_release"}, k = 1, mv = {1, 1, 15})
public abstract class Prob {
    private final String name;

    public abstract boolean equals(Object other);

    public abstract boolean getCanBeDisable();

    /* JADX INFO: compiled from: Prob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob$TimePass;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "timePassed", BuildConfig.FLAVOR, "(I)V", "canBeDisable", BuildConfig.FLAVOR, "getCanBeDisable", "()Z", "getTimePassed", "()I", "equals", "other", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class TimePass extends Prob {
        private final boolean canBeDisable;
        private final int timePassed;

        public TimePass() {
            this(0, 1, null);
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean equals(Object other) {
            return false;
        }

        public TimePass(int i) {
            super(BuildConfig.FLAVOR, null);
            this.timePassed = i;
        }

        public /* synthetic */ TimePass(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i);
        }

        public final int getTimePassed() {
            return this.timePassed;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean getCanBeDisable() {
            return this.canBeDisable;
        }
    }

    private Prob(String str) {
        this.name = str;
    }

    public /* synthetic */ Prob(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: compiled from: Prob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob$OptionPassed;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "path", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "canBeDisable", BuildConfig.FLAVOR, "getCanBeDisable", "()Z", "getPath", "()Ljava/lang/String;", "equals", "other", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class OptionPassed extends Prob {
        private final boolean canBeDisable;
        private final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionPassed(String path) {
            super(BuildConfig.FLAVOR, null);
            Intrinsics.checkParameterIsNotNull(path, "path");
            this.path = path;
        }

        public final String getPath() {
            return this.path;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean getCanBeDisable() {
            return this.canBeDisable;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean equals(Object other) {
            String str = this.path;
            if (!(other instanceof OptionPassed)) {
                other = null;
            }
            OptionPassed optionPassed = (OptionPassed) other;
            return Intrinsics.areEqual(str, optionPassed != null ? optionPassed.path : null);
        }
    }

    /* JADX INFO: compiled from: Prob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob$Condition;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "_canBeDisable", BuildConfig.FLAVOR, "condition", "Lkotlin/Function1;", "Lkr/hs/bsis/helloworld08/bsis2033/Player;", "(ZLkotlin/jvm/functions/Function1;)V", "canBeDisable", "getCanBeDisable", "()Z", "getCondition", "()Lkotlin/jvm/functions/Function1;", "equals", "other", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class Condition extends Prob {
        private final boolean canBeDisable;
        private final Function1<Player, Boolean> condition;

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean equals(Object other) {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Condition(boolean z, Function1<? super Player, Boolean> condition) {
            super(BuildConfig.FLAVOR, null);
            Intrinsics.checkParameterIsNotNull(condition, "condition");
            this.condition = condition;
            this.canBeDisable = z;
        }

        public /* synthetic */ Condition(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, function1);
        }

        public final Function1<Player, Boolean> getCondition() {
            return this.condition;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean getCanBeDisable() {
            return this.canBeDisable;
        }
    }

    /* JADX INFO: compiled from: Prob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob$Disposable;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "name", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "canBeDisable", BuildConfig.FLAVOR, "getCanBeDisable", "()Z", "equals", "other", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class Disposable extends Prob {
        private final boolean canBeDisable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disposable(String name) {
            super(name, null);
            Intrinsics.checkParameterIsNotNull(name, "name");
            this.canBeDisable = true;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean getCanBeDisable() {
            return this.canBeDisable;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean equals(Object other) {
            if (!(other instanceof Disposable)) {
                other = null;
            }
            Disposable disposable = (Disposable) other;
            return Intrinsics.areEqual(disposable != null ? disposable.getName() : null, getName());
        }
    }

    /* JADX INFO: compiled from: Prob.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/Prob$Normal;", "Lkr/hs/bsis/helloworld08/bsis2033/Prob;", "name", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "canBeDisable", BuildConfig.FLAVOR, "getCanBeDisable", "()Z", "equals", "other", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {1, 1, 15})
    public static final class Normal extends Prob {
        private final boolean canBeDisable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Normal(String name) {
            super(name, null);
            Intrinsics.checkParameterIsNotNull(name, "name");
            this.canBeDisable = true;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean getCanBeDisable() {
            return this.canBeDisable;
        }

        @Override // kr.hs.bsis.helloworld08.bsis2033.Prob
        public boolean equals(Object other) {
            if (!(other instanceof Normal)) {
                other = null;
            }
            Normal normal = (Normal) other;
            return Intrinsics.areEqual(normal != null ? normal.getName() : null, getName());
        }
    }

    public String toString() {
        return this.name;
    }
}
