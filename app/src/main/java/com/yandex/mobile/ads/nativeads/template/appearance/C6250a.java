package com.yandex.mobile.ads.nativeads.template.appearance;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.template.appearance.TextAppearance;

/* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.a */
/* loaded from: classes3.dex */
final class C6250a {
    /* renamed from: a */
    public static TextAppearance m30720a(@NonNull TextAppearance textAppearance, @Nullable TextAppearance textAppearance2) {
        if (textAppearance2 == null || textAppearance.equals(textAppearance2)) {
            return textAppearance;
        }
        int textColor = textAppearance2.getTextColor();
        float textSize = textAppearance2.getTextSize();
        String fontFamilyName = textAppearance2.getFontFamilyName();
        int fontStyle = textAppearance2.getFontStyle();
        TextAppearance.Builder builder = new TextAppearance.Builder();
        if (textColor == 0) {
            textColor = textAppearance.getTextColor();
        }
        TextAppearance.Builder textColor2 = builder.setTextColor(textColor);
        if (textSize < 1.0f) {
            textSize = textAppearance.getTextSize();
        }
        TextAppearance.Builder textSize2 = textColor2.setTextSize(textSize);
        if (TextUtils.isEmpty(fontFamilyName)) {
            fontFamilyName = textAppearance.getFontFamilyName();
        }
        return textSize2.setFontFamilyName(fontFamilyName).setFontStyle(fontStyle).build();
    }
}
