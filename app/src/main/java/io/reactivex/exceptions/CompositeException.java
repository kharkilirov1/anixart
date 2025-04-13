package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: b */
    public final List<Throwable> f59607b;

    /* renamed from: c */
    public final String f59608c;

    /* renamed from: d */
    public Throwable f59609d;

    public static final class CompositeExceptionCausalChain extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class PrintStreamOrWriter {
        /* renamed from: a */
        public abstract void mo31401a(Object obj);
    }

    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* renamed from: a */
        public final PrintStream f59610a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f59610a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        /* renamed from: a */
        public void mo31401a(Object obj) {
            this.f59610a.println(obj);
        }
    }

    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* renamed from: a */
        public final PrintWriter f59611a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f59611a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        /* renamed from: a */
        public void mo31401a(Object obj) {
            this.f59611a.println(obj);
        }
    }

    public CompositeException(@NonNull Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void m31399a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m31399a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final void m31400b(PrintStreamOrWriter printStreamOrWriter) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.f59607b) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            m31399a(sb, th, "\t");
            i2++;
        }
        printStreamOrWriter.mo31401a(sb.toString());
    }

    @Override // java.lang.Throwable
    @NonNull
    public synchronized Throwable getCause() {
        if (this.f59609d == null) {
            CompositeExceptionCausalChain compositeExceptionCausalChain = new CompositeExceptionCausalChain();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f59607b.iterator();
            CompositeExceptionCausalChain compositeExceptionCausalChain2 = compositeExceptionCausalChain;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Throwable th = (Throwable) it2.next();
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        compositeExceptionCausalChain2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = compositeExceptionCausalChain2.getCause();
                    if (cause3 != null && compositeExceptionCausalChain2 != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause4;
                        }
                        compositeExceptionCausalChain2 = cause3;
                    }
                }
            }
            this.f59609d = compositeExceptionCausalChain;
        }
        return this.f59609d;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return this.f59608c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m31400b(new WrappedPrintStream(printStream));
    }

    public CompositeException(@NonNull Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f59607b);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f59607b = unmodifiableList;
            this.f59608c = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m31400b(new WrappedPrintWriter(printWriter));
    }
}
