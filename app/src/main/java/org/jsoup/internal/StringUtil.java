package org.jsoup.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class StringUtil {

    /* renamed from: a */
    public static final String[] f68937a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b */
    public static final Pattern f68938b = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: c */
    public static final Pattern f68939c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: d */
    public static final ThreadLocal<Stack<StringBuilder>> f68940d = new ThreadLocal<Stack<StringBuilder>>() { // from class: org.jsoup.internal.StringUtil.1
        @Override // java.lang.ThreadLocal
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    };

    public static class StringJoiner {

        /* renamed from: b */
        public final String f68942b;

        /* renamed from: a */
        @Nullable
        public StringBuilder f68941a = StringUtil.m34700b();

        /* renamed from: c */
        public boolean f68943c = true;

        public StringJoiner(String str) {
            this.f68942b = str;
        }

        /* renamed from: a */
        public StringJoiner m34707a(Object obj) {
            Validate.m34694g(this.f68941a);
            if (!this.f68943c) {
                this.f68941a.append(this.f68942b);
            }
            this.f68941a.append(obj);
            this.f68943c = false;
            return this;
        }
    }

    /* renamed from: a */
    public static void m34699a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                if (!(codePointAt == 8203 || codePointAt == 173)) {
                    sb.appendCodePoint(codePointAt);
                    z2 = true;
                    z3 = false;
                }
            } else if ((!z || z2) && !z3) {
                sb.append(' ');
                z3 = true;
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: b */
    public static StringBuilder m34700b() {
        Stack<StringBuilder> stack = f68940d.get();
        return stack.empty() ? new StringBuilder(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST) : stack.pop();
    }

    /* renamed from: c */
    public static boolean m34701c(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: d */
    public static boolean m34702d(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (!m34703e(str.codePointAt(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m34703e(int i2) {
        return i2 == 32 || i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13;
    }

    /* renamed from: f */
    public static String m34704f(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        stringJoiner.m34707a(obj);
        while (it.hasNext()) {
            stringJoiner.m34707a(it.next());
        }
        String m34705g = m34705g(stringJoiner.f68941a);
        stringJoiner.f68941a = null;
        return m34705g;
    }

    /* renamed from: g */
    public static String m34705g(StringBuilder sb) {
        Validate.m34694g(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = f68940d.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    /* renamed from: h */
    public static URL m34706h(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = f68938b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            StringBuilder m27x = C0000a.m27x(replaceFirst, "#");
            m27x.append(url2.getRef());
            replaceFirst = m27x.toString();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
