package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: g */
    public static final StackTraceElement[] f8277g = new StackTraceElement[0];

    /* renamed from: b */
    public final List<Throwable> f8278b;

    /* renamed from: c */
    public Key f8279c;

    /* renamed from: d */
    public DataSource f8280d;

    /* renamed from: e */
    public Class<?> f8281e;

    /* renamed from: f */
    public String f8282f;

    public GlideException(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f8282f = str;
        setStackTrace(f8277g);
        this.f8278b = emptyList;
    }

    /* renamed from: b */
    public static void m5047b(List<Throwable> list, Appendable appendable) {
        try {
            m5048c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public static void m5048c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).m5052f(appendable);
            } else {
                m5049d(th, appendable);
            }
            i2 = i3;
        }
    }

    /* renamed from: d */
    public static void m5049d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void m5050a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f8278b.iterator();
        while (it.hasNext()) {
            m5050a(it.next(), list);
        }
    }

    /* renamed from: e */
    public void m5051e(String str) {
        ArrayList arrayList = new ArrayList();
        m5050a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder m24u = C0000a.m24u("Root cause (");
            int i3 = i2 + 1;
            m24u.append(i3);
            m24u.append(" of ");
            m24u.append(size);
            m24u.append(")");
            Log.i(str, m24u.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    /* renamed from: f */
    public final void m5052f(Appendable appendable) {
        m5049d(this, appendable);
        m5047b(this.f8278b, new IndentedAppendable(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f8282f);
        String str3 = "";
        if (this.f8281e != null) {
            StringBuilder m24u = C0000a.m24u(", ");
            m24u.append(this.f8281e);
            str = m24u.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f8280d != null) {
            StringBuilder m24u2 = C0000a.m24u(", ");
            m24u2.append(this.f8280d);
            str2 = m24u2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f8279c != null) {
            StringBuilder m24u3 = C0000a.m24u(", ");
            m24u3.append(this.f8279c);
            str3 = m24u3.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        m5050a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        m5052f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m5052f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m5052f(printWriter);
    }

    public static final class IndentedAppendable implements Appendable {

        /* renamed from: b */
        public final Appendable f8283b;

        /* renamed from: c */
        public boolean f8284c = true;

        public IndentedAppendable(Appendable appendable) {
            this.f8283b = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f8284c) {
                this.f8284c = false;
                this.f8283b.append("  ");
            }
            this.f8284c = c2 == '\n';
            this.f8283b.append(c2);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i2, int i3) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f8284c) {
                this.f8284c = false;
                this.f8283b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f8284c = z;
            this.f8283b.append(charSequence, i2, i3);
            return this;
        }
    }

    public GlideException(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f8282f = str;
        setStackTrace(f8277g);
        this.f8278b = singletonList;
    }

    public GlideException(String str, List<Throwable> list) {
        this.f8282f = str;
        setStackTrace(f8277g);
        this.f8278b = list;
    }
}
