package com.yandex.div.core.font;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes2.dex */
public interface DivTypefaceProvider {

    /* renamed from: b */
    public static final DivTypefaceProvider f31272b = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }
    };

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();
}
