package com.squareup.okhttp;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class CacheControl {

    /* renamed from: a */
    public final boolean f24791a;

    /* renamed from: b */
    public final boolean f24792b;

    /* renamed from: c */
    public final int f24793c;

    /* renamed from: d */
    public final int f24794d;

    /* renamed from: e */
    public final boolean f24795e;

    /* renamed from: f */
    public final boolean f24796f;

    /* renamed from: g */
    public final boolean f24797g;

    /* renamed from: h */
    public final int f24798h;

    /* renamed from: i */
    public final int f24799i;

    /* renamed from: j */
    public final boolean f24800j;

    /* renamed from: k */
    public final boolean f24801k;

    /* renamed from: l */
    public String f24802l;

    public static final class Builder {

        /* renamed from: a */
        public boolean f24803a;

        /* renamed from: b */
        public int f24804b = -1;

        /* renamed from: c */
        public boolean f24805c;
    }

    static {
        new Builder().f24803a = true;
        Builder builder = new Builder();
        builder.f24805c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        builder.f24804b = seconds <= ParserMinimalBase.MAX_INT_L ? (int) seconds : Integer.MAX_VALUE;
    }

    public String toString() {
        String str = this.f24802l;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f24791a) {
                sb.append("no-cache, ");
            }
            if (this.f24792b) {
                sb.append("no-store, ");
            }
            if (this.f24793c != -1) {
                sb.append("max-age=");
                sb.append(this.f24793c);
                sb.append(", ");
            }
            if (this.f24794d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f24794d);
                sb.append(", ");
            }
            if (this.f24795e) {
                sb.append("private, ");
            }
            if (this.f24796f) {
                sb.append("public, ");
            }
            if (this.f24797g) {
                sb.append("must-revalidate, ");
            }
            if (this.f24798h != -1) {
                sb.append("max-stale=");
                sb.append(this.f24798h);
                sb.append(", ");
            }
            if (this.f24799i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f24799i);
                sb.append(", ");
            }
            if (this.f24800j) {
                sb.append("only-if-cached, ");
            }
            if (this.f24801k) {
                sb.append("no-transform, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f24802l = str;
        }
        return str;
    }
}
