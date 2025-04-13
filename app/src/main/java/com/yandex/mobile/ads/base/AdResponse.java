package com.yandex.mobile.ads.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.EnumC5007e6;
import com.yandex.mobile.ads.impl.EnumC5870uk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdResponse<T> implements Parcelable {

    /* renamed from: A */
    private final boolean f47659A;

    /* renamed from: B */
    private final boolean f47660B;

    /* renamed from: C */
    private final boolean f47661C;

    /* renamed from: D */
    private final int f47662D;

    /* renamed from: E */
    private final int f47663E;

    /* renamed from: F */
    private final int f47664F;

    /* renamed from: G */
    private final int f47665G;

    /* renamed from: H */
    private final int f47666H;

    /* renamed from: I */
    private final int f47667I;

    /* renamed from: J */
    private final boolean f47668J;

    /* renamed from: K */
    @Nullable
    private FalseClick f47669K;

    /* renamed from: a */
    @Nullable
    private final EnumC5007e6 f47670a;

    /* renamed from: b */
    @Nullable
    private final String f47671b;

    /* renamed from: c */
    @Nullable
    private final String f47672c;

    /* renamed from: d */
    @Nullable
    private final String f47673d;

    /* renamed from: e */
    @NonNull
    private final SizeInfo f47674e;

    /* renamed from: f */
    @Nullable
    private final List<String> f47675f;

    /* renamed from: g */
    @Nullable
    private final List<String> f47676g;

    /* renamed from: h */
    @Nullable
    private final List<String> f47677h;

    /* renamed from: i */
    @Nullable
    private final Long f47678i;

    /* renamed from: j */
    @Nullable
    private final String f47679j;

    /* renamed from: k */
    @Nullable
    private final Locale f47680k;

    /* renamed from: l */
    @Nullable
    private final List<String> f47681l;

    /* renamed from: m */
    @Nullable
    private final AdImpressionData f47682m;

    /* renamed from: n */
    @Nullable
    private final List<Long> f47683n;

    /* renamed from: o */
    @Nullable
    private final List<Integer> f47684o;

    /* renamed from: p */
    @Nullable
    private final String f47685p;

    /* renamed from: q */
    @Nullable
    private final String f47686q;

    /* renamed from: r */
    @Nullable
    private final String f47687r;

    /* renamed from: s */
    @Nullable
    private final EnumC5870uk f47688s;

    /* renamed from: t */
    @Nullable
    private final String f47689t;

    /* renamed from: u */
    @Nullable
    private final MediationData f47690u;

    /* renamed from: v */
    @Nullable
    private final RewardData f47691v;

    /* renamed from: w */
    @Nullable
    private final Long f47692w;

    /* renamed from: x */
    @Nullable
    private final T f47693x;

    /* renamed from: y */
    @Nullable
    private final Map<String, Object> f47694y;

    /* renamed from: z */
    private final boolean f47695z;

    /* renamed from: L */
    public static final Integer f47657L = 100;
    public static final Parcelable.Creator<AdResponse> CREATOR = new C4645a();

    /* renamed from: M */
    private static final Integer f47658M = 1000;

    /* renamed from: com.yandex.mobile.ads.base.AdResponse$a */
    public class C4645a implements Parcelable.Creator<AdResponse> {
        @Override // android.os.Parcelable.Creator
        public final AdResponse createFromParcel(Parcel parcel) {
            return new AdResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdResponse[] newArray(int i2) {
            return new AdResponse[i2];
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.AdResponse$b */
    public static class C4646b<T> {

        /* renamed from: A */
        private int f47696A;

        /* renamed from: B */
        private int f47697B;

        /* renamed from: C */
        private int f47698C;

        /* renamed from: D */
        private int f47699D;

        /* renamed from: E */
        private int f47700E;

        /* renamed from: F */
        private int f47701F;

        /* renamed from: G */
        private boolean f47702G;

        /* renamed from: H */
        private boolean f47703H;

        /* renamed from: I */
        private boolean f47704I;

        /* renamed from: J */
        private boolean f47705J;

        /* renamed from: K */
        private boolean f47706K;

        /* renamed from: a */
        @Nullable
        private EnumC5007e6 f47707a;

        /* renamed from: b */
        @Nullable
        private String f47708b;

        /* renamed from: c */
        @Nullable
        private String f47709c;

        /* renamed from: d */
        @Nullable
        private String f47710d;

        /* renamed from: e */
        @Nullable
        private EnumC5870uk f47711e;

        /* renamed from: f */
        @Nullable
        private int f47712f;

        /* renamed from: g */
        @Nullable
        private List<String> f47713g;

        /* renamed from: h */
        @Nullable
        private List<String> f47714h;

        /* renamed from: i */
        @Nullable
        private List<String> f47715i;

        /* renamed from: j */
        @Nullable
        private Long f47716j;

        /* renamed from: k */
        @Nullable
        private String f47717k;

        /* renamed from: l */
        @Nullable
        private Locale f47718l;

        /* renamed from: m */
        @Nullable
        private List<String> f47719m;

        /* renamed from: n */
        @Nullable
        private FalseClick f47720n;

        /* renamed from: o */
        @Nullable
        private AdImpressionData f47721o;

        /* renamed from: p */
        @Nullable
        private List<Long> f47722p;

        /* renamed from: q */
        @Nullable
        private List<Integer> f47723q;

        /* renamed from: r */
        @Nullable
        private String f47724r;

        /* renamed from: s */
        @Nullable
        private MediationData f47725s;

        /* renamed from: t */
        @Nullable
        private RewardData f47726t;

        /* renamed from: u */
        @Nullable
        private Long f47727u;

        /* renamed from: v */
        @Nullable
        private T f47728v;

        /* renamed from: w */
        @Nullable
        private String f47729w;

        /* renamed from: x */
        @Nullable
        private String f47730x;

        /* renamed from: y */
        @Nullable
        private String f47731y;

        /* renamed from: z */
        @Nullable
        private Map<String, Object> f47732z;

        @NonNull
        /* renamed from: a */
        public final void m21881a(@NonNull EnumC5007e6 enumC5007e6) {
            this.f47707a = enumC5007e6;
        }

        @NonNull
        /* renamed from: b */
        public final void m21889b(int i2) {
            this.f47697B = i2;
        }

        @NonNull
        /* renamed from: c */
        public final void m21896c(@NonNull ArrayList arrayList) {
            this.f47713g = arrayList;
        }

        @NonNull
        /* renamed from: d */
        public final void m21899d(@NonNull String str) {
            this.f47708b = str;
        }

        @NonNull
        /* renamed from: e */
        public final void m21903e(@Nullable String str) {
            this.f47710d = str;
        }

        @NonNull
        /* renamed from: f */
        public final void m21908f(@NonNull ArrayList arrayList) {
            this.f47714h = arrayList;
        }

        @NonNull
        /* renamed from: g */
        public final void m21910g(@NonNull String str) {
            this.f47709c = str;
        }

        @NonNull
        /* renamed from: h */
        public final void m21911h(@Nullable String str) {
            this.f47731y = str;
        }

        @NonNull
        /* renamed from: a */
        public final void m21883a(@NonNull Long l2) {
            this.f47716j = l2;
        }

        @NonNull
        /* renamed from: b */
        public final void m21892b(@NonNull ArrayList arrayList) {
            this.f47719m = arrayList;
        }

        @NonNull
        /* renamed from: c */
        public final void m21894c(int i2) {
            this.f47699D = i2;
        }

        @NonNull
        /* renamed from: d */
        public final void m21900d(@NonNull ArrayList arrayList) {
            this.f47723q = arrayList;
        }

        @NonNull
        /* renamed from: e */
        public final void m21902e(int i2) {
            this.f47696A = i2;
        }

        @NonNull
        /* renamed from: f */
        public final void m21907f(@NonNull String str) {
            this.f47717k = str;
        }

        @NonNull
        /* renamed from: g */
        public final void m21909g(@Nullable int i2) {
            this.f47712f = i2;
        }

        @NonNull
        /* renamed from: a */
        public final void m21887a(@NonNull Locale locale) {
            this.f47718l = locale;
        }

        @NonNull
        /* renamed from: b */
        public final void m21891b(@Nullable String str) {
            this.f47724r = str;
        }

        @NonNull
        /* renamed from: c */
        public final void m21897c(boolean z) {
            this.f47705J = z;
        }

        @NonNull
        /* renamed from: d */
        public final void m21898d(int i2) {
            this.f47700E = i2;
        }

        @NonNull
        /* renamed from: e */
        public final void m21904e(@NonNull ArrayList arrayList) {
            this.f47715i = arrayList;
        }

        @NonNull
        /* renamed from: f */
        public final void m21906f(int i2) {
            this.f47698C = i2;
        }

        @NonNull
        /* renamed from: a */
        public final void m21879a(@Nullable FalseClick falseClick) {
            this.f47720n = falseClick;
        }

        @NonNull
        /* renamed from: b */
        public final void m21890b(@Nullable Long l2) {
            this.f47727u = l2;
        }

        @NonNull
        /* renamed from: c */
        public final void m21895c(@Nullable String str) {
            this.f47729w = str;
        }

        @NonNull
        /* renamed from: d */
        public final void m21901d(boolean z) {
            this.f47702G = z;
        }

        @NonNull
        /* renamed from: e */
        public final void m21905e(boolean z) {
            this.f47704I = z;
        }

        @NonNull
        /* renamed from: a */
        public final void m21880a(@Nullable AdImpressionData adImpressionData) {
            this.f47721o = adImpressionData;
        }

        @NonNull
        /* renamed from: b */
        public final void m21893b(boolean z) {
            this.f47703H = z;
        }

        @NonNull
        /* renamed from: a */
        public final void m21885a(@NonNull ArrayList arrayList) {
            this.f47722p = arrayList;
        }

        @NonNull
        /* renamed from: a */
        public final void m21876a(int i2) {
            this.f47701F = i2;
        }

        @NonNull
        /* renamed from: a */
        public final void m21877a(@Nullable MediationData mediationData) {
            this.f47725s = mediationData;
        }

        @NonNull
        /* renamed from: a */
        public final C4646b<T> m21874a(@Nullable T t) {
            this.f47728v = t;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final void m21878a(@NonNull RewardData rewardData) {
            this.f47726t = rewardData;
        }

        @NonNull
        /* renamed from: a */
        public final void m21884a(@Nullable String str) {
            this.f47730x = str;
        }

        @NonNull
        /* renamed from: a */
        public final void m21882a(@Nullable EnumC5870uk enumC5870uk) {
            this.f47711e = enumC5870uk;
        }

        @NonNull
        /* renamed from: a */
        public final void m21886a(@NonNull HashMap hashMap) {
            this.f47732z = hashMap;
        }

        /* renamed from: a */
        public final void m21888a(boolean z) {
            this.f47706K = z;
        }

        @NonNull
        /* renamed from: a */
        public final AdResponse<T> m21875a() {
            return new AdResponse<>(this, 0);
        }
    }

    public /* synthetic */ AdResponse(C4646b c4646b, int i2) {
        this(c4646b);
    }

    @Nullable
    /* renamed from: A */
    public final String m21800A() {
        return this.f47672c;
    }

    @Nullable
    /* renamed from: B */
    public final T m21801B() {
        return this.f47693x;
    }

    @Nullable
    /* renamed from: C */
    public final RewardData m21802C() {
        return this.f47691v;
    }

    @Nullable
    /* renamed from: D */
    public final Long m21803D() {
        return this.f47692w;
    }

    @Nullable
    /* renamed from: E */
    public final String m21804E() {
        return this.f47689t;
    }

    @NonNull
    /* renamed from: F */
    public final SizeInfo m21805F() {
        return this.f47674e;
    }

    /* renamed from: G */
    public final boolean m21806G() {
        return this.f47668J;
    }

    /* renamed from: H */
    public final boolean m21807H() {
        return this.f47659A;
    }

    /* renamed from: I */
    public final boolean m21808I() {
        return this.f47661C;
    }

    /* renamed from: J */
    public final boolean m21809J() {
        return this.f47695z;
    }

    /* renamed from: K */
    public final boolean m21810K() {
        return this.f47660B;
    }

    /* renamed from: L */
    public final boolean m21811L() {
        return this.f47663E > 0;
    }

    /* renamed from: M */
    public final boolean m21812M() {
        return this.f47667I == 0;
    }

    @Nullable
    /* renamed from: c */
    public final List<String> m21813c() {
        return this.f47676g;
    }

    /* renamed from: d */
    public final int m21814d() {
        return this.f47667I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public final String m21815e() {
        return this.f47687r;
    }

    @Nullable
    /* renamed from: f */
    public final List<Long> m21816f() {
        return this.f47683n;
    }

    /* renamed from: g */
    public final int m21817g() {
        return f47658M.intValue() * this.f47663E;
    }

    /* renamed from: h */
    public final int m21818h() {
        return this.f47663E;
    }

    /* renamed from: i */
    public final int m21819i() {
        return f47658M.intValue() * this.f47664F;
    }

    @Nullable
    /* renamed from: j */
    public final List<String> m21820j() {
        return this.f47681l;
    }

    @Nullable
    /* renamed from: k */
    public final String m21821k() {
        return this.f47686q;
    }

    @Nullable
    /* renamed from: l */
    public final List<String> m21822l() {
        return this.f47675f;
    }

    @Nullable
    /* renamed from: m */
    public final String m21823m() {
        return this.f47685p;
    }

    @Nullable
    /* renamed from: n */
    public final EnumC5007e6 m21824n() {
        return this.f47670a;
    }

    @Nullable
    /* renamed from: o */
    public final String m21825o() {
        return this.f47671b;
    }

    @Nullable
    /* renamed from: p */
    public final String m21826p() {
        return this.f47673d;
    }

    @Nullable
    /* renamed from: q */
    public final List<Integer> m21827q() {
        return this.f47684o;
    }

    /* renamed from: r */
    public final int m21828r() {
        return this.f47666H;
    }

    @Nullable
    /* renamed from: s */
    public final Map<String, Object> m21829s() {
        return this.f47694y;
    }

    @Nullable
    /* renamed from: t */
    public final List<String> m21830t() {
        return this.f47677h;
    }

    @Nullable
    /* renamed from: u */
    public final Long m21831u() {
        return this.f47678i;
    }

    @Nullable
    /* renamed from: v */
    public final EnumC5870uk m21832v() {
        return this.f47688s;
    }

    @Nullable
    /* renamed from: w */
    public final String m21833w() {
        return this.f47679j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        EnumC5007e6 enumC5007e6 = this.f47670a;
        parcel.writeInt(enumC5007e6 == null ? -1 : enumC5007e6.ordinal());
        parcel.writeString(this.f47671b);
        parcel.writeString(this.f47672c);
        parcel.writeString(this.f47673d);
        parcel.writeParcelable(this.f47674e, i2);
        parcel.writeStringList(this.f47675f);
        parcel.writeStringList(this.f47677h);
        parcel.writeValue(this.f47678i);
        parcel.writeString(this.f47679j);
        parcel.writeSerializable(this.f47680k);
        parcel.writeStringList(this.f47681l);
        parcel.writeParcelable(this.f47669K, i2);
        parcel.writeParcelable(this.f47682m, i2);
        parcel.writeList(this.f47683n);
        parcel.writeList(this.f47684o);
        parcel.writeString(this.f47685p);
        parcel.writeString(this.f47686q);
        parcel.writeString(this.f47687r);
        EnumC5870uk enumC5870uk = this.f47688s;
        parcel.writeInt(enumC5870uk != null ? enumC5870uk.ordinal() : -1);
        parcel.writeString(this.f47689t);
        parcel.writeParcelable(this.f47690u, i2);
        parcel.writeParcelable(this.f47691v, i2);
        parcel.writeValue(this.f47692w);
        parcel.writeSerializable(this.f47693x.getClass());
        parcel.writeValue(this.f47693x);
        parcel.writeByte(this.f47695z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47659A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47660B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f47661C ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f47662D);
        parcel.writeInt(this.f47663E);
        parcel.writeInt(this.f47664F);
        parcel.writeInt(this.f47665G);
        parcel.writeInt(this.f47666H);
        parcel.writeInt(this.f47667I);
        parcel.writeMap(this.f47694y);
        parcel.writeBoolean(this.f47668J);
    }

    @Nullable
    /* renamed from: x */
    public final FalseClick m21834x() {
        return this.f47669K;
    }

    @Nullable
    /* renamed from: y */
    public final AdImpressionData m21835y() {
        return this.f47682m;
    }

    @Nullable
    /* renamed from: z */
    public final MediationData m21836z() {
        return this.f47690u;
    }

    private AdResponse(@NonNull C4646b<T> c4646b) {
        this.f47670a = ((C4646b) c4646b).f47707a;
        this.f47673d = ((C4646b) c4646b).f47710d;
        this.f47671b = ((C4646b) c4646b).f47708b;
        this.f47672c = ((C4646b) c4646b).f47709c;
        int i2 = ((C4646b) c4646b).f47696A;
        this.f47666H = i2;
        int i3 = ((C4646b) c4646b).f47697B;
        this.f47667I = i3;
        this.f47674e = new SizeInfo(i2, i3, ((C4646b) c4646b).f47712f != 0 ? ((C4646b) c4646b).f47712f : 1);
        this.f47675f = ((C4646b) c4646b).f47713g;
        this.f47676g = ((C4646b) c4646b).f47714h;
        this.f47677h = ((C4646b) c4646b).f47715i;
        this.f47678i = ((C4646b) c4646b).f47716j;
        this.f47679j = ((C4646b) c4646b).f47717k;
        this.f47680k = ((C4646b) c4646b).f47718l;
        this.f47681l = ((C4646b) c4646b).f47719m;
        this.f47683n = ((C4646b) c4646b).f47722p;
        this.f47684o = ((C4646b) c4646b).f47723q;
        this.f47669K = ((C4646b) c4646b).f47720n;
        this.f47682m = ((C4646b) c4646b).f47721o;
        this.f47662D = ((C4646b) c4646b).f47698C;
        this.f47663E = ((C4646b) c4646b).f47699D;
        this.f47664F = ((C4646b) c4646b).f47700E;
        this.f47665G = ((C4646b) c4646b).f47701F;
        this.f47685p = ((C4646b) c4646b).f47729w;
        this.f47686q = ((C4646b) c4646b).f47724r;
        this.f47687r = ((C4646b) c4646b).f47730x;
        this.f47688s = ((C4646b) c4646b).f47711e;
        this.f47689t = ((C4646b) c4646b).f47731y;
        this.f47693x = (T) ((C4646b) c4646b).f47728v;
        this.f47690u = ((C4646b) c4646b).f47725s;
        this.f47691v = ((C4646b) c4646b).f47726t;
        this.f47692w = ((C4646b) c4646b).f47727u;
        this.f47695z = ((C4646b) c4646b).f47702G;
        this.f47659A = ((C4646b) c4646b).f47703H;
        this.f47660B = ((C4646b) c4646b).f47704I;
        this.f47661C = ((C4646b) c4646b).f47705J;
        this.f47694y = ((C4646b) c4646b).f47732z;
        this.f47668J = ((C4646b) c4646b).f47706K;
    }

    public AdResponse(Parcel parcel) {
        int readInt = parcel.readInt();
        T t = null;
        this.f47670a = readInt == -1 ? null : EnumC5007e6.values()[readInt];
        this.f47671b = parcel.readString();
        this.f47672c = parcel.readString();
        this.f47673d = parcel.readString();
        this.f47674e = (SizeInfo) parcel.readParcelable(SizeInfo.class.getClassLoader());
        this.f47675f = parcel.createStringArrayList();
        this.f47676g = parcel.createStringArrayList();
        this.f47677h = parcel.createStringArrayList();
        this.f47678i = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f47679j = parcel.readString();
        this.f47680k = (Locale) parcel.readSerializable();
        this.f47681l = parcel.createStringArrayList();
        this.f47669K = (FalseClick) parcel.readParcelable(FalseClick.class.getClassLoader());
        this.f47682m = (AdImpressionData) parcel.readParcelable(AdImpressionData.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f47683n = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f47684o = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        this.f47685p = parcel.readString();
        this.f47686q = parcel.readString();
        this.f47687r = parcel.readString();
        int readInt2 = parcel.readInt();
        this.f47688s = readInt2 == -1 ? null : EnumC5870uk.values()[readInt2];
        this.f47689t = parcel.readString();
        this.f47690u = (MediationData) parcel.readParcelable(MediationData.class.getClassLoader());
        this.f47691v = (RewardData) parcel.readParcelable(RewardData.class.getClassLoader());
        this.f47692w = (Long) parcel.readValue(Long.class.getClassLoader());
        Class cls = (Class) parcel.readSerializable();
        this.f47693x = cls != null ? (T) parcel.readValue(cls.getClassLoader()) : t;
        this.f47695z = parcel.readByte() != 0;
        this.f47659A = parcel.readByte() != 0;
        this.f47660B = parcel.readByte() != 0;
        this.f47661C = parcel.readByte() != 0;
        this.f47662D = parcel.readInt();
        this.f47663E = parcel.readInt();
        this.f47664F = parcel.readInt();
        this.f47665G = parcel.readInt();
        this.f47666H = parcel.readInt();
        this.f47667I = parcel.readInt();
        HashMap hashMap = new HashMap();
        this.f47694y = hashMap;
        parcel.readMap(hashMap, Object.class.getClassLoader());
        this.f47668J = parcel.readBoolean();
    }
}
