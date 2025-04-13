package com.google.firebase.firestore.index;

/* loaded from: classes2.dex */
public class IndexByteEncoder {

    /* renamed from: a */
    public final OrderedCodeWriter f22770a = new OrderedCodeWriter();

    /* renamed from: b */
    public final AscendingIndexByteEncoder f22771b = new AscendingIndexByteEncoder();

    /* renamed from: c */
    public final DescendingIndexByteEncoder f22772c = new DescendingIndexByteEncoder();

    public class AscendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public AscendingIndexByteEncoder() {
        }
    }

    public class DescendingIndexByteEncoder extends DirectionalIndexByteEncoder {
        public DescendingIndexByteEncoder() {
        }
    }
}
