package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LottieCompositionMoshiParser {

    /* renamed from: a */
    public static final JsonReader.Options f7754a = JsonReader.Options.m4804a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    public static JsonReader.Options f7755b = JsonReader.Options.m4804a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    public static final JsonReader.Options f7756c = JsonReader.Options.m4804a("list");

    /* renamed from: d */
    public static final JsonReader.Options f7757d = JsonReader.Options.m4804a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0047. Please report as an issue. */
    /* renamed from: a */
    public static LottieComposition m4785a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArrayCompat<FontCharacter> sparseArrayCompat;
        LottieComposition lottieComposition;
        ArrayList arrayList3;
        LottieComposition lottieComposition2;
        float f2;
        float f3;
        LottieComposition lottieComposition3;
        float m4853c = Utils.m4853c();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>(10);
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        SparseArrayCompat<FontCharacter> sparseArrayCompat2 = new SparseArrayCompat<>();
        LottieComposition lottieComposition4 = new LottieComposition();
        jsonReader.mo4788b();
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (jsonReader.mo4791g()) {
            switch (jsonReader.mo4799p(f7754a)) {
                case 0:
                    arrayList = arrayList5;
                    i2 = jsonReader.mo4794j();
                    arrayList5 = arrayList;
                    break;
                case 1:
                    arrayList = arrayList5;
                    i3 = jsonReader.mo4794j();
                    arrayList5 = arrayList;
                    break;
                case 2:
                    arrayList2 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition = lottieComposition4;
                    f5 = (float) jsonReader.mo4793i();
                    lottieComposition4 = lottieComposition;
                    arrayList5 = arrayList2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 3:
                    arrayList2 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition = lottieComposition4;
                    f4 = ((float) jsonReader.mo4793i()) - 0.01f;
                    lottieComposition4 = lottieComposition;
                    arrayList5 = arrayList2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 4:
                    arrayList2 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition = lottieComposition4;
                    f6 = (float) jsonReader.mo4793i();
                    lottieComposition4 = lottieComposition;
                    arrayList5 = arrayList2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 5:
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition2 = lottieComposition4;
                    f2 = f4;
                    f3 = f5;
                    String[] split = jsonReader.mo4796l().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        lottieComposition2.m4646a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 6:
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    LottieComposition lottieComposition5 = lottieComposition4;
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4787a();
                    int i4 = 0;
                    while (jsonReader.mo4791g()) {
                        LottieComposition lottieComposition6 = lottieComposition5;
                        Layer m4784a = LayerParser.m4784a(jsonReader, lottieComposition6);
                        if (m4784a.f7668e == Layer.LayerType.IMAGE) {
                            i4++;
                        }
                        arrayList4.add(m4784a);
                        longSparseArray.m1098m(m4784a.f7667d, m4784a);
                        if (i4 > 4) {
                            Logger.m4833a("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        lottieComposition5 = lottieComposition6;
                    }
                    lottieComposition2 = lottieComposition5;
                    jsonReader.mo4789c();
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 7:
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4787a();
                    while (jsonReader.mo4791g()) {
                        ArrayList arrayList6 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray(10);
                        jsonReader.mo4788b();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i5 = 0;
                        int i6 = 0;
                        while (jsonReader.mo4791g()) {
                            int mo4799p = jsonReader.mo4799p(f7755b);
                            if (mo4799p != 0) {
                                if (mo4799p == 1) {
                                    jsonReader.mo4787a();
                                    while (jsonReader.mo4791g()) {
                                        Layer m4784a2 = LayerParser.m4784a(jsonReader, lottieComposition4);
                                        longSparseArray2.m1098m(m4784a2.f7667d, m4784a2);
                                        arrayList6.add(m4784a2);
                                        lottieComposition4 = lottieComposition4;
                                    }
                                    lottieComposition3 = lottieComposition4;
                                    jsonReader.mo4789c();
                                } else if (mo4799p == 2) {
                                    i5 = jsonReader.mo4794j();
                                } else if (mo4799p == 3) {
                                    i6 = jsonReader.mo4794j();
                                } else if (mo4799p == 4) {
                                    str2 = jsonReader.mo4796l();
                                } else if (mo4799p != 5) {
                                    jsonReader.mo4800q();
                                    jsonReader.mo4802u();
                                    lottieComposition3 = lottieComposition4;
                                } else {
                                    str3 = jsonReader.mo4796l();
                                }
                                lottieComposition4 = lottieComposition3;
                            } else {
                                str = jsonReader.mo4796l();
                            }
                        }
                        LottieComposition lottieComposition7 = lottieComposition4;
                        jsonReader.mo4790e();
                        if (str2 != null) {
                            hashMap2.put(str, new LottieImageAsset(i5, i6, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList6);
                        }
                        lottieComposition4 = lottieComposition7;
                    }
                    jsonReader.mo4789c();
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 8:
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4788b();
                    while (jsonReader.mo4791g()) {
                        if (jsonReader.mo4799p(f7756c) != 0) {
                            jsonReader.mo4800q();
                            jsonReader.mo4802u();
                        } else {
                            jsonReader.mo4787a();
                            while (jsonReader.mo4791g()) {
                                JsonReader.Options options = FontParser.f7737a;
                                jsonReader.mo4788b();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                float f7 = 0.0f;
                                while (jsonReader.mo4791g()) {
                                    ArrayList arrayList7 = arrayList5;
                                    int mo4799p2 = jsonReader.mo4799p(FontParser.f7737a);
                                    if (mo4799p2 != 0) {
                                        SparseArrayCompat<FontCharacter> sparseArrayCompat3 = sparseArrayCompat2;
                                        if (mo4799p2 == 1) {
                                            str5 = jsonReader.mo4796l();
                                        } else if (mo4799p2 == 2) {
                                            str6 = jsonReader.mo4796l();
                                        } else if (mo4799p2 != 3) {
                                            jsonReader.mo4800q();
                                            jsonReader.mo4802u();
                                        } else {
                                            f7 = (float) jsonReader.mo4793i();
                                        }
                                        arrayList5 = arrayList7;
                                        sparseArrayCompat2 = sparseArrayCompat3;
                                    } else {
                                        str4 = jsonReader.mo4796l();
                                        arrayList5 = arrayList7;
                                    }
                                }
                                jsonReader.mo4790e();
                                hashMap3.put(str5, new Font(str4, str5, str6, f7));
                                arrayList5 = arrayList5;
                            }
                            jsonReader.mo4789c();
                        }
                    }
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    jsonReader.mo4790e();
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 9:
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4787a();
                    while (jsonReader.mo4791g()) {
                        JsonReader.Options options2 = FontCharacterParser.f7735a;
                        ArrayList arrayList8 = new ArrayList();
                        jsonReader.mo4788b();
                        double d = 0.0d;
                        double d2 = 0.0d;
                        String str7 = null;
                        String str8 = null;
                        char c2 = 0;
                        while (jsonReader.mo4791g()) {
                            int mo4799p3 = jsonReader.mo4799p(FontCharacterParser.f7735a);
                            if (mo4799p3 == 0) {
                                c2 = jsonReader.mo4796l().charAt(0);
                            } else if (mo4799p3 == 1) {
                                d = jsonReader.mo4793i();
                            } else if (mo4799p3 == 2) {
                                d2 = jsonReader.mo4793i();
                            } else if (mo4799p3 == 3) {
                                str7 = jsonReader.mo4796l();
                            } else if (mo4799p3 == 4) {
                                str8 = jsonReader.mo4796l();
                            } else if (mo4799p3 != 5) {
                                jsonReader.mo4800q();
                                jsonReader.mo4802u();
                            } else {
                                jsonReader.mo4788b();
                                while (jsonReader.mo4791g()) {
                                    if (jsonReader.mo4799p(FontCharacterParser.f7736b) != 0) {
                                        jsonReader.mo4800q();
                                        jsonReader.mo4802u();
                                    } else {
                                        jsonReader.mo4787a();
                                        while (jsonReader.mo4791g()) {
                                            arrayList8.add((ShapeGroup) ContentModelParser.m4776a(jsonReader, lottieComposition4));
                                        }
                                        jsonReader.mo4789c();
                                    }
                                }
                                jsonReader.mo4790e();
                            }
                        }
                        jsonReader.mo4790e();
                        FontCharacter fontCharacter = new FontCharacter(arrayList8, c2, d, d2, str7, str8);
                        sparseArrayCompat2.m1132f(fontCharacter.hashCode(), fontCharacter);
                    }
                    jsonReader.mo4789c();
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                case 10:
                    jsonReader.mo4787a();
                    while (jsonReader.mo4791g()) {
                        jsonReader.mo4788b();
                        String str9 = null;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        while (jsonReader.mo4791g()) {
                            int mo4799p4 = jsonReader.mo4799p(f7757d);
                            if (mo4799p4 != 0) {
                                float f10 = f4;
                                if (mo4799p4 == 1) {
                                    f8 = (float) jsonReader.mo4793i();
                                } else if (mo4799p4 != 2) {
                                    jsonReader.mo4800q();
                                    jsonReader.mo4802u();
                                } else {
                                    f9 = (float) jsonReader.mo4793i();
                                }
                                f4 = f10;
                            } else {
                                str9 = jsonReader.mo4796l();
                            }
                        }
                        jsonReader.mo4790e();
                        arrayList5.add(new Marker(str9, f8, f9));
                        f5 = f5;
                        f4 = f4;
                    }
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4789c();
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition2 = lottieComposition4;
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
                default:
                    arrayList3 = arrayList5;
                    sparseArrayCompat = sparseArrayCompat2;
                    lottieComposition2 = lottieComposition4;
                    f2 = f4;
                    f3 = f5;
                    jsonReader.mo4800q();
                    jsonReader.mo4802u();
                    lottieComposition4 = lottieComposition2;
                    f5 = f3;
                    arrayList5 = arrayList3;
                    f4 = f2;
                    sparseArrayCompat2 = sparseArrayCompat;
                    break;
            }
        }
        ArrayList arrayList9 = arrayList5;
        LottieComposition lottieComposition8 = lottieComposition4;
        lottieComposition8.f7148j = new Rect(0, 0, (int) (i2 * m4853c), (int) (i3 * m4853c));
        lottieComposition8.f7149k = f5;
        lottieComposition8.f7150l = f4;
        lottieComposition8.f7151m = f6;
        lottieComposition8.f7147i = arrayList4;
        lottieComposition8.f7146h = longSparseArray;
        lottieComposition8.f7141c = hashMap;
        lottieComposition8.f7142d = hashMap2;
        lottieComposition8.f7145g = sparseArrayCompat2;
        lottieComposition8.f7143e = hashMap3;
        lottieComposition8.f7144f = arrayList9;
        return lottieComposition8;
    }
}
