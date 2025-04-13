package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorBlueComponentSetter;", "Lcom/yandex/div/evaluable/function/ColorComponentSetter;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ColorBlueComponentSetter extends ColorComponentSetter {

    /* renamed from: g */
    @NotNull
    public static final ColorBlueComponentSetter f33207g = new ColorBlueComponentSetter();

    /* renamed from: h */
    @NotNull
    public static final String f33208h = "setColorBlue";

    public ColorBlueComponentSetter() {
        super(new Function2<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentSetter.1
            @Override // kotlin.jvm.functions.Function2
            public Color invoke(Color color, Double d) {
                int i2 = color.f33642a;
                return new Color(Color.f33641b.m17273a(i2 >>> 24, (i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE, (i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE, ColorFunctionsKt.m17238a(d.doubleValue())));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String mo17232c() {
        return f33208h;
    }
}
