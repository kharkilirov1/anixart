package com.google.common.escape;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: classes.dex */
final class Platform {

    /* renamed from: a */
    public static final ThreadLocal<char[]> f21669a = new ThreadLocal<char[]>() { // from class: com.google.common.escape.Platform.1
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
        }
    };
}
