package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3718Wc;

/* renamed from: com.yandex.metrica.impl.ob.Xe */
/* loaded from: classes2.dex */
public class C3745Xe {

    /* renamed from: a */
    @Nullable
    public final String f44479a;

    /* renamed from: b */
    @Nullable
    public String f44480b;

    /* renamed from: c */
    @Nullable
    public final Integer f44481c;

    /* renamed from: d */
    @Nullable
    public final Integer f44482d;

    /* renamed from: e */
    @Nullable
    public final Integer f44483e;

    /* renamed from: f */
    @Nullable
    public final Long f44484f;

    /* renamed from: g */
    @Nullable
    public final String f44485g;

    /* renamed from: h */
    @Nullable
    public final String f44486h;

    /* renamed from: i */
    @Nullable
    public final String f44487i;

    /* renamed from: j */
    @Nullable
    public final EnumC4067k1 f44488j;

    /* renamed from: k */
    @Nullable
    public final Integer f44489k;

    /* renamed from: l */
    @Nullable
    public final String f44490l;

    /* renamed from: m */
    @Nullable
    public final String f44491m;

    /* renamed from: n */
    @Nullable
    public final Integer f44492n;

    /* renamed from: o */
    @Nullable
    public final Integer f44493o;

    /* renamed from: p */
    @Nullable
    public final String f44494p;

    /* renamed from: q */
    @Nullable
    public final String f44495q;

    /* renamed from: r */
    @NonNull
    public final EnumC4141mn f44496r;

    /* renamed from: s */
    @Nullable
    public final EnumC3482N0 f44497s;

    /* renamed from: t */
    @Nullable
    public final C3456M.b.a f44498t;

    /* renamed from: u */
    @Nullable
    public final C3718Wc.a f44499u;

    /* renamed from: v */
    @Nullable
    public final Integer f44500v;

    /* renamed from: w */
    @Nullable
    public final Integer f44501w;

    /* renamed from: x */
    @Nullable
    public final EnumC3357I0 f44502x;

    /* renamed from: y */
    @Nullable
    public final Boolean f44503y;

    /* renamed from: z */
    @Nullable
    public final Integer f44504z;

    public C3745Xe(@NonNull ContentValues contentValues) {
        Integer asInteger = contentValues.getAsInteger("type");
        this.f44488j = asInteger == null ? null : EnumC4067k1.m20216a(asInteger.intValue());
        this.f44489k = contentValues.getAsInteger("custom_type");
        this.f44479a = contentValues.getAsString("name");
        this.f44480b = contentValues.getAsString("value");
        this.f44484f = contentValues.getAsLong("time");
        this.f44481c = contentValues.getAsInteger("number");
        this.f44482d = contentValues.getAsInteger("global_number");
        this.f44483e = contentValues.getAsInteger("number_of_type");
        this.f44486h = contentValues.getAsString("cell_info");
        this.f44485g = contentValues.getAsString("location_info");
        this.f44487i = contentValues.getAsString("wifi_network_info");
        this.f44490l = contentValues.getAsString("error_environment");
        this.f44491m = contentValues.getAsString("user_info");
        this.f44492n = contentValues.getAsInteger("truncated");
        this.f44493o = contentValues.getAsInteger("connection_type");
        this.f44494p = contentValues.getAsString("cellular_connection_type");
        this.f44495q = contentValues.getAsString("profile_id");
        this.f44496r = EnumC4141mn.m20404a(contentValues.getAsInteger("encrypting_mode"));
        this.f44497s = EnumC3482N0.m18604a(contentValues.getAsInteger("first_occurrence_status"));
        this.f44498t = C3456M.b.a.m18536a(contentValues.getAsInteger("battery_charge_type"));
        this.f44499u = C3718Wc.a.m19355a(contentValues.getAsString("collection_mode"));
        this.f44500v = contentValues.getAsInteger("has_omitted_data");
        this.f44501w = contentValues.getAsInteger("call_state");
        Integer asInteger2 = contentValues.getAsInteger("source");
        this.f44502x = asInteger2 != null ? EnumC3357I0.m18242a(asInteger2.intValue()) : null;
        this.f44503y = contentValues.getAsBoolean("attribution_id_changed");
        this.f44504z = contentValues.getAsInteger("open_id");
    }
}
