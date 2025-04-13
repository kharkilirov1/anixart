package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Loader<D> {

    /* renamed from: a */
    public int f4731a;

    /* renamed from: b */
    public OnLoadCompleteListener<D> f4732b;

    /* renamed from: c */
    public Context f4733c;

    /* renamed from: d */
    public boolean f4734d = false;

    /* renamed from: e */
    public boolean f4735e = false;

    /* renamed from: f */
    public boolean f4736f = true;

    /* renamed from: g */
    public boolean f4737g = false;

    /* renamed from: h */
    public boolean f4738h = false;

    public final class ForceLoadContentObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            throw null;
        }
    }

    public interface OnLoadCanceledListener<D> {
    }

    public interface OnLoadCompleteListener<D> {
        /* renamed from: a */
        void mo3258a(@NonNull Loader<D> loader, @Nullable D d);
    }

    public Loader(@NonNull Context context) {
        this.f4733c = context.getApplicationContext();
    }

    @MainThread
    /* renamed from: a */
    public void mo3273a(@Nullable D d) {
        OnLoadCompleteListener<D> onLoadCompleteListener = this.f4732b;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.mo3258a(this, d);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo3262b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f4731a);
        printWriter.print(" mListener=");
        printWriter.println(this.f4732b);
        if (this.f4734d || this.f4737g || this.f4738h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f4734d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f4737g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f4738h);
        }
        if (this.f4735e || this.f4736f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f4735e);
            printWriter.print(" mReset=");
            printWriter.println(this.f4736f);
        }
    }

    @MainThread
    /* renamed from: c */
    public boolean mo3263c() {
        return false;
    }

    @MainThread
    /* renamed from: d */
    public void mo3274d() {
    }

    @MainThread
    /* renamed from: e */
    public void mo3275e() {
    }

    @MainThread
    /* renamed from: f */
    public void mo3276f() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.m2021a(this, sb);
        sb.append(" id=");
        return C0000a.m18o(sb, this.f4731a, "}");
    }
}
