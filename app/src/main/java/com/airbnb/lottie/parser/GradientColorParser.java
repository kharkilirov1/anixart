package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {

    /* renamed from: a */
    public int f7738a;

    public GradientColorParser(int i2) {
        this.f7738a = i2;
    }

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public GradientColor mo4775a(JsonReader jsonReader, float f2) throws IOException {
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        boolean z = jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo4787a();
        }
        while (jsonReader.mo4791g()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo4793i()));
        }
        if (z) {
            jsonReader.mo4789c();
        }
        if (this.f7738a == -1) {
            this.f7738a = arrayList.size() / 4;
        }
        int i4 = this.f7738a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = this.f7738a * 4;
            if (i5 >= i2) {
                break;
            }
            int i8 = i5 / 4;
            double floatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 == 0) {
                fArr[i8] = (float) floatValue;
            } else if (i9 == 1) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (floatValue * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, i6, i7, (int) (floatValue * 255.0d));
            }
            i5++;
        }
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        if (arrayList.size() > i2) {
            int size = (arrayList.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i10 = 0;
            while (i2 < arrayList.size()) {
                if (i2 % 2 == 0) {
                    dArr[i10] = ((Float) arrayList.get(i2)).floatValue();
                } else {
                    dArr2[i10] = ((Float) arrayList.get(i2)).floatValue();
                    i10++;
                }
                i2++;
            }
            while (true) {
                int[] iArr2 = gradientColor.f7523b;
                if (i3 >= iArr2.length) {
                    break;
                }
                int i11 = iArr2[i3];
                double d2 = gradientColor.f7522a[i3];
                int i12 = 1;
                while (true) {
                    if (i12 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i13 = i12 - 1;
                    double d3 = dArr[i13];
                    double d4 = dArr[i12];
                    if (dArr[i12] >= d2) {
                        double d5 = dArr2[i13];
                        double d6 = dArr2[i12];
                        PointF pointF = MiscUtils.f7846a;
                        d = ((d6 - d5) * ((d2 - d3) / (d4 - d3))) + d5;
                        break;
                    }
                    i12++;
                }
                gradientColor.f7523b[i3] = Color.argb((int) (d * 255.0d), Color.red(i11), Color.green(i11), Color.blue(i11));
                i3++;
            }
        }
        return gradientColor;
    }
}
