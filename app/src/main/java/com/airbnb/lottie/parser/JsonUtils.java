package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
class JsonUtils {

    /* renamed from: a */
    public static final JsonReader.Options f7745a = JsonReader.Options.m4804a("x", "y");

    /* renamed from: com.airbnb.lottie.parser.JsonUtils$1 */
    public static /* synthetic */ class C07701 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7746a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f7746a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7746a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7746a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ColorInt
    /* renamed from: a */
    public static int m4777a(JsonReader jsonReader) throws IOException {
        jsonReader.mo4787a();
        int mo4793i = (int) (jsonReader.mo4793i() * 255.0d);
        int mo4793i2 = (int) (jsonReader.mo4793i() * 255.0d);
        int mo4793i3 = (int) (jsonReader.mo4793i() * 255.0d);
        while (jsonReader.mo4791g()) {
            jsonReader.mo4802u();
        }
        jsonReader.mo4789c();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, mo4793i, mo4793i2, mo4793i3);
    }

    /* renamed from: b */
    public static PointF m4778b(JsonReader jsonReader, float f2) throws IOException {
        int ordinal = jsonReader.mo4797n().ordinal();
        if (ordinal == 0) {
            jsonReader.mo4787a();
            float mo4793i = (float) jsonReader.mo4793i();
            float mo4793i2 = (float) jsonReader.mo4793i();
            while (jsonReader.mo4797n() != JsonReader.Token.END_ARRAY) {
                jsonReader.mo4802u();
            }
            jsonReader.mo4789c();
            return new PointF(mo4793i * f2, mo4793i2 * f2);
        }
        if (ordinal != 2) {
            if (ordinal != 6) {
                StringBuilder m24u = C0000a.m24u("Unknown point starts with ");
                m24u.append(jsonReader.mo4797n());
                throw new IllegalArgumentException(m24u.toString());
            }
            float mo4793i3 = (float) jsonReader.mo4793i();
            float mo4793i4 = (float) jsonReader.mo4793i();
            while (jsonReader.mo4791g()) {
                jsonReader.mo4802u();
            }
            return new PointF(mo4793i3 * f2, mo4793i4 * f2);
        }
        jsonReader.mo4788b();
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (jsonReader.mo4791g()) {
            int mo4799p = jsonReader.mo4799p(f7745a);
            if (mo4799p == 0) {
                f3 = m4780d(jsonReader);
            } else if (mo4799p != 1) {
                jsonReader.mo4800q();
                jsonReader.mo4802u();
            } else {
                f4 = m4780d(jsonReader);
            }
        }
        jsonReader.mo4790e();
        return new PointF(f3 * f2, f4 * f2);
    }

    /* renamed from: c */
    public static List<PointF> m4779c(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo4787a();
        while (jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo4787a();
            arrayList.add(m4778b(jsonReader, f2));
            jsonReader.mo4789c();
        }
        jsonReader.mo4789c();
        return arrayList;
    }

    /* renamed from: d */
    public static float m4780d(JsonReader jsonReader) throws IOException {
        JsonReader.Token mo4797n = jsonReader.mo4797n();
        int ordinal = mo4797n.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                return (float) jsonReader.mo4793i();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + mo4797n);
        }
        jsonReader.mo4787a();
        float mo4793i = (float) jsonReader.mo4793i();
        while (jsonReader.mo4791g()) {
            jsonReader.mo4802u();
        }
        jsonReader.mo4789c();
        return mo4793i;
    }
}
