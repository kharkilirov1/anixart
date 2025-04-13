package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import java.util.Collection;

@RestrictTo
/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: D0 */
    void mo9981D0(long j2);

    @NonNull
    /* renamed from: N */
    Collection<Pair<Long, Long>> mo9982N();

    @NonNull
    /* renamed from: R */
    View mo9983R(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<S> onSelectionChangedListener);

    @StyleRes
    /* renamed from: X */
    int mo9984X(Context context);

    /* renamed from: Z */
    boolean mo9985Z();

    @NonNull
    /* renamed from: d0 */
    Collection<Long> mo9986d0();

    @NonNull
    /* renamed from: e */
    String mo9987e(Context context);

    @Nullable
    /* renamed from: n0 */
    S mo9988n0();
}
