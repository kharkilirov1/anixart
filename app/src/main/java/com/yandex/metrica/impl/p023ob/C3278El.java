package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.El */
/* loaded from: classes2.dex */
public class C3278El extends C3727Wl {

    /* renamed from: h */
    @NonNull
    public String f42829h;

    /* renamed from: i */
    public final int f42830i;

    /* renamed from: j */
    @Nullable
    public Integer f42831j;

    /* renamed from: k */
    public final boolean f42832k;

    /* renamed from: l */
    @NonNull
    public final b f42833l;

    /* renamed from: m */
    @Nullable
    public final Float f42834m;

    /* renamed from: n */
    @Nullable
    public final Float f42835n;

    /* renamed from: o */
    @Nullable
    public final Float f42836o;

    /* renamed from: p */
    @Nullable
    public final String f42837p;

    /* renamed from: q */
    @Nullable
    public final Boolean f42838q;

    /* renamed from: r */
    @Nullable
    public final Boolean f42839r;

    /* renamed from: s */
    @Nullable
    public Integer f42840s;

    /* renamed from: com.yandex.metrica.impl.ob.El$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42841a;

        static {
            int[] iArr = new int[TextUtils.TruncateAt.values().length];
            f42841a = iArr;
            try {
                iArr[TextUtils.TruncateAt.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42841a[TextUtils.TruncateAt.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42841a[TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42841a[TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.El$b */
    public enum b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN("UNKNOWN");


        /* renamed from: a */
        @NonNull
        public final String f42849a;

        b(@NonNull String str) {
            this.f42849a = str;
        }
    }

    public C3278El(@NonNull String str, @NonNull String str2, @Nullable C3727Wl.b bVar, int i2, boolean z, @NonNull C3727Wl.a aVar, @NonNull String str3, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable String str4, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z2, int i3, @NonNull b bVar2) {
        super(str, str2, null, i2, z, C3727Wl.c.VIEW, aVar);
        this.f42829h = str3;
        this.f42830i = i3;
        this.f42833l = bVar2;
        this.f42832k = z2;
        this.f42834m = f2;
        this.f42835n = f3;
        this.f42836o = f4;
        this.f42837p = str4;
        this.f42838q = bool;
        this.f42839r = bool2;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    @Nullable
    /* renamed from: a */
    public C3727Wl.b mo18016a(@NonNull C3853bl c3853bl) {
        C3727Wl.b bVar = this.f44402c;
        return bVar == null ? c3853bl.m19662a(this.f42829h) : bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    /* renamed from: a */
    public boolean mo18018a() {
        return true;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TextViewElement{mText='");
        C0576a.m4100A(m24u, this.f42829h, '\'', ", mVisibleTextLength=");
        m24u.append(this.f42830i);
        m24u.append(", mOriginalTextLength=");
        m24u.append(this.f42831j);
        m24u.append(", mIsVisible=");
        m24u.append(this.f42832k);
        m24u.append(", mTextShorteningType=");
        m24u.append(this.f42833l);
        m24u.append(", mSizePx=");
        m24u.append(this.f42834m);
        m24u.append(", mSizeDp=");
        m24u.append(this.f42835n);
        m24u.append(", mSizeSp=");
        m24u.append(this.f42836o);
        m24u.append(", mColor='");
        C0576a.m4100A(m24u, this.f42837p, '\'', ", mIsBold=");
        m24u.append(this.f42838q);
        m24u.append(", mIsItalic=");
        m24u.append(this.f42839r);
        m24u.append(", mRelativeTextSize=");
        m24u.append(this.f42840s);
        m24u.append(", mClassName='");
        C0576a.m4100A(m24u, this.f44400a, '\'', ", mId='");
        C0576a.m4100A(m24u, this.f44401b, '\'', ", mParseFilterReason=");
        m24u.append(this.f44402c);
        m24u.append(", mDepth=");
        m24u.append(this.f44403d);
        m24u.append(", mListItem=");
        m24u.append(this.f44404e);
        m24u.append(", mViewType=");
        m24u.append(this.f44405f);
        m24u.append(", mClassType=");
        m24u.append(this.f44406g);
        m24u.append('}');
        return m24u.toString();
    }

    @Override // com.yandex.metrica.impl.p023ob.C3727Wl
    @Nullable
    /* renamed from: a */
    public JSONArray mo18017a(@NonNull C3428Kl c3428Kl) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f42829h;
            if (str.length() > c3428Kl.f43296l) {
                this.f42831j = Integer.valueOf(this.f42829h.length());
                str = this.f42829h.substring(0, c3428Kl.f43296l);
            }
            jSONObject.put("t", "TEXT");
            jSONObject.put("vl", str);
            jSONObject.put("i", m18015a(c3428Kl, str));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    @NonNull
    /* renamed from: a */
    private JSONObject m18015a(@NonNull C3428Kl c3428Kl, @NonNull String str) {
        int length;
        JSONObject jSONObject = new JSONObject();
        try {
            if (c3428Kl.f43285a) {
                jSONObject.putOpt("sp", this.f42834m).putOpt("sd", this.f42835n).putOpt("ss", this.f42836o);
            }
            if (c3428Kl.f43286b) {
                jSONObject.put("rts", this.f42840s);
            }
            if (c3428Kl.f43288d) {
                jSONObject.putOpt("c", this.f42837p).putOpt("ib", this.f42838q).putOpt("ii", this.f42839r);
            }
            if (c3428Kl.f43287c) {
                jSONObject.put("vtl", this.f42830i).put("iv", this.f42832k).put("tst", this.f42833l.f42849a);
            }
            Integer num = this.f42831j;
            if (num != null) {
                length = num.intValue();
            } else {
                length = this.f42829h.length();
            }
            if (c3428Kl.f43291g) {
                jSONObject.put("tl", str.length()).put("otl", length);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
