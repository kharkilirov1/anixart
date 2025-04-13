package com.google.android.exoplayer2.p009ui;

import com.google.android.exoplayer2.p009ui.SpannedToHtmlConverter;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.ui.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1157c implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C1157c f14321c = new C1157c(0);

    /* renamed from: d */
    public static final /* synthetic */ C1157c f14322d = new C1157c(1);

    /* renamed from: b */
    public final /* synthetic */ int f14323b;

    public /* synthetic */ C1157c(int i2) {
        this.f14323b = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f14323b) {
            case 0:
                SpannedToHtmlConverter.SpanInfo spanInfo = (SpannedToHtmlConverter.SpanInfo) obj;
                SpannedToHtmlConverter.SpanInfo spanInfo2 = (SpannedToHtmlConverter.SpanInfo) obj2;
                int compare = Integer.compare(spanInfo2.f14223b, spanInfo.f14223b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = spanInfo.f14224c.compareTo(spanInfo2.f14224c);
                return compareTo != 0 ? compareTo : spanInfo.f14225d.compareTo(spanInfo2.f14225d);
            default:
                SpannedToHtmlConverter.SpanInfo spanInfo3 = (SpannedToHtmlConverter.SpanInfo) obj;
                SpannedToHtmlConverter.SpanInfo spanInfo4 = (SpannedToHtmlConverter.SpanInfo) obj2;
                int compare2 = Integer.compare(spanInfo4.f14222a, spanInfo3.f14222a);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = spanInfo4.f14224c.compareTo(spanInfo3.f14224c);
                return compareTo2 != 0 ? compareTo2 : spanInfo4.f14225d.compareTo(spanInfo3.f14225d);
        }
    }
}
