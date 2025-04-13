package androidx.loader.content;

import android.database.Cursor;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CursorLoader extends AsyncTaskLoader<Cursor> {

    /* renamed from: l */
    public Cursor f4729l;

    /* renamed from: m */
    public CancellationSignal f4730m;

    @Override // androidx.loader.content.AsyncTaskLoader, androidx.loader.content.Loader
    @Deprecated
    /* renamed from: b */
    public void mo3262b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3262b(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println((Object) null);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString((Object[]) null));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println((String) null);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f4729l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f4737g);
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: d */
    public void mo3274d() {
        mo3263c();
        Cursor cursor = this.f4729l;
        if (cursor != null && !cursor.isClosed()) {
            this.f4729l.close();
        }
        this.f4729l = null;
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: e */
    public void mo3275e() {
        Cursor cursor = this.f4729l;
        if (cursor != null) {
            mo3273a(cursor);
        }
        boolean z = this.f4737g;
        this.f4737g = false;
        this.f4738h |= z;
        if (z || this.f4729l == null) {
            m3269l();
        }
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: f */
    public void mo3276f() {
        mo3263c();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: g */
    public void mo3264g() {
        synchronized (this) {
            CancellationSignal cancellationSignal = this.f4730m;
            if (cancellationSignal != null) {
                cancellationSignal.m1945a();
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: j */
    public Cursor mo3267j() {
        synchronized (this) {
            if (this.f4726k != null) {
                throw new OperationCanceledException();
            }
            this.f4730m = new CancellationSignal();
        }
        try {
            Cursor m1666a = ContentResolverCompat.m1666a(this.f4733c.getContentResolver(), null, null, null, null, null, this.f4730m);
            if (m1666a != null) {
                try {
                    m1666a.getCount();
                    m1666a.registerContentObserver(null);
                } catch (RuntimeException e2) {
                    m1666a.close();
                    throw e2;
                }
            }
            synchronized (this) {
                this.f4730m = null;
            }
            return m1666a;
        } catch (Throwable th) {
            synchronized (this) {
                this.f4730m = null;
                throw th;
            }
        }
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    /* renamed from: k */
    public void mo3268k(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo3273a(Cursor cursor) {
        Loader.OnLoadCompleteListener<D> onLoadCompleteListener;
        if (this.f4736f) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f4729l;
        this.f4729l = cursor;
        if (this.f4734d && (onLoadCompleteListener = this.f4732b) != 0) {
            onLoadCompleteListener.mo3258a(this, cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }
}
