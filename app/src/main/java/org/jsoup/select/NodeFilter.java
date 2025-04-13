package org.jsoup.select;

/* loaded from: classes3.dex */
public interface NodeFilter {

    public enum FilterResult {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }
}
