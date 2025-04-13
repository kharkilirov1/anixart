package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.room.util.C0576a;
import com.airbnb.lottie.model.content.ShapeGroup;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
public class FontCharacter {

    /* renamed from: a */
    public final List<ShapeGroup> f7486a;

    /* renamed from: b */
    public final char f7487b;

    /* renamed from: c */
    public final double f7488c;

    /* renamed from: d */
    public final String f7489d;

    /* renamed from: e */
    public final String f7490e;

    public FontCharacter(List<ShapeGroup> list, char c2, double d, double d2, String str, String str2) {
        this.f7486a = list;
        this.f7487b = c2;
        this.f7488c = d2;
        this.f7489d = str;
        this.f7490e = str2;
    }

    /* renamed from: a */
    public static int m4729a(char c2, String str, String str2) {
        return str2.hashCode() + C0576a.m4107f(str, (c2 + 0) * 31, 31);
    }

    public int hashCode() {
        return m4729a(this.f7487b, this.f7490e, this.f7489d);
    }
}
