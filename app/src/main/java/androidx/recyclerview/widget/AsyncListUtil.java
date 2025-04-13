package androidx.recyclerview.widget;

import androidx.recyclerview.widget.ThreadUtil;

/* loaded from: classes.dex */
public class AsyncListUtil<T> {

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$1 */
    public class C04971 implements ThreadUtil.MainThreadCallback<T> {
    }

    /* renamed from: androidx.recyclerview.widget.AsyncListUtil$2 */
    public class C04982 implements ThreadUtil.BackgroundCallback<T> {
    }

    public static abstract class DataCallback<T> {
    }

    public static abstract class ViewCallback {
    }
}
