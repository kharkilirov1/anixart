package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.Color;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/ColorBlueComponentGetter;", "Lcom/yandex/div/evaluable/function/ColorComponentGetter;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ColorBlueComponentGetter extends ColorComponentGetter {

    /* renamed from: g */
    @NotNull
    public static final ColorBlueComponentGetter f33204g = new ColorBlueComponentGetter();

    /* renamed from: h */
    @NotNull
    public static final String f33205h = "getColorBlue";

    public ColorBlueComponentGetter() {
        super(new Function1<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentGetter.1
            @Override // kotlin.jvm.functions.Function1
            public Integer invoke(Color color) {
                return Integer.valueOf(color.f33642a & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String mo17232c() {
        return f33205h;
    }
}
