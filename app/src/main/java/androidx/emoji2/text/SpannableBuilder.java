package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo
/* loaded from: classes.dex */
public final class SpannableBuilder extends SpannableStringBuilder {

    /* renamed from: b */
    @NonNull
    public final Class<?> f4069b;

    /* renamed from: c */
    @NonNull
    public final List<WatcherWrapper> f4070c;

    public static class WatcherWrapper implements TextWatcher, SpanWatcher {

        /* renamed from: b */
        public final Object f4071b;

        /* renamed from: c */
        public final AtomicInteger f4072c = new AtomicInteger(0);

        public WatcherWrapper(Object obj) {
            this.f4071b = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f4071b).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f4071b).beforeTextChanged(charSequence, i2, i3, i4);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f4072c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f4071b).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            int i6;
            int i7;
            if (this.f4072c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i8 = i2 > i3 ? 0 : i2;
                    if (i4 > i5) {
                        i6 = i8;
                        i7 = 0;
                    } else {
                        i7 = i4;
                        i6 = i8;
                    }
                } else {
                    i6 = i2;
                    i7 = i4;
                }
                ((SpanWatcher) this.f4071b).onSpanChanged(spannable, obj, i6, i3, i7, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f4072c.get() <= 0 || !(obj instanceof EmojiSpan)) {
                ((SpanWatcher) this.f4071b).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f4071b).onTextChanged(charSequence, i2, i3, i4);
        }
    }

    @RestrictTo
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f4070c = new ArrayList();
        Preconditions.m2032e(cls, "watcherClass cannot be null");
        this.f4069b = cls;
    }

    /* renamed from: a */
    public final void m2843a() {
        for (int i2 = 0; i2 < this.f4070c.size(); i2++) {
            this.f4070c.get(i2).f4072c.incrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Editable append(@SuppressLint CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @RestrictTo
    /* renamed from: b */
    public void m2844b() {
        m2847e();
        for (int i2 = 0; i2 < this.f4070c.size(); i2++) {
            this.f4070c.get(i2).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: c */
    public final WatcherWrapper m2845c(Object obj) {
        for (int i2 = 0; i2 < this.f4070c.size(); i2++) {
            WatcherWrapper watcherWrapper = this.f4070c.get(i2);
            if (watcherWrapper.f4071b == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m2846d(@Nullable Object obj) {
        if (obj != null) {
            if (this.f4069b == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* renamed from: e */
    public final void m2847e() {
        for (int i2 = 0; i2 < this.f4070c.size(); i2++) {
            this.f4070c.get(i2).f4072c.decrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        WatcherWrapper m2845c;
        if (m2846d(obj) && (m2845c = m2845c(obj)) != null) {
            obj = m2845c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        WatcherWrapper m2845c;
        if (m2846d(obj) && (m2845c = m2845c(obj)) != null) {
            obj = m2845c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        WatcherWrapper m2845c;
        if (m2846d(obj) && (m2845c = m2845c(obj)) != null) {
            obj = m2845c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint
    public <T> T[] getSpans(int i2, int i3, @NonNull Class<T> cls) {
        if (!(this.f4069b == cls)) {
            return (T[]) super.getSpans(i2, i3, cls);
        }
        WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i2, i3, WatcherWrapper.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length));
        for (int i4 = 0; i4 < watcherWrapperArr.length; i4++) {
            tArr[i4] = watcherWrapperArr[i4].f4071b;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if ((r1.f4069b == r4) != false) goto L8;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int nextSpanTransition(int r2, int r3, @androidx.annotation.Nullable java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.f4069b
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r4 = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.SpannableBuilder.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        WatcherWrapper watcherWrapper;
        if (m2846d(obj)) {
            watcherWrapper = m2845c(obj);
            if (watcherWrapper != null) {
                obj = watcherWrapper;
            }
        } else {
            watcherWrapper = null;
        }
        super.removeSpan(obj);
        if (watcherWrapper != null) {
            this.f4070c.remove(watcherWrapper);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public Editable replace(int i2, int i3, CharSequence charSequence) {
        m2843a();
        super.replace(i2, i3, charSequence);
        m2847e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i2, int i3, int i4) {
        if (m2846d(obj)) {
            WatcherWrapper watcherWrapper = new WatcherWrapper(obj);
            this.f4070c.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint
    public CharSequence subSequence(int i2, int i3) {
        return new SpannableBuilder(this.f4069b, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Appendable append(@SuppressLint CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        m2843a();
        super.replace(i2, i3, charSequence);
        m2847e();
        return this;
    }

    @RestrictTo
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f4070c = new ArrayList();
        Preconditions.m2032e(cls, "watcherClass cannot be null");
        this.f4069b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Appendable append(char c2) throws IOException {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Editable append(@SuppressLint CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m2843a();
        super.replace(i2, i3, charSequence, i4, i5);
        m2847e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public Appendable append(@SuppressLint CharSequence charSequence, int i2, int i3) throws IOException {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m2843a();
        super.replace(i2, i3, charSequence, i4, i5);
        m2847e();
        return this;
    }
}
