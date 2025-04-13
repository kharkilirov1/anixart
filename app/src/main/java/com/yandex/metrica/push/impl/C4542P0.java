package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.push.common.utils.DoNotInline;

@RequiresApi
@DoNotInline
/* renamed from: com.yandex.metrica.push.impl.P0 */
/* loaded from: classes2.dex */
public class C4542P0 {
    @Nullable
    /* renamed from: a */
    public static Drawable m21470a(@NonNull Context context, @NonNull Integer num) {
        try {
            return context.getResources().getDrawable(num.intValue(), null);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
