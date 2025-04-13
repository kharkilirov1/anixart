package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.util.Arrays;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiProcessor {

    /* renamed from: a */
    @NonNull
    public final EmojiCompat.SpanFactory f4033a;

    /* renamed from: b */
    @NonNull
    public final MetadataRepo f4034b;

    /* renamed from: c */
    @NonNull
    public EmojiCompat.GlyphChecker f4035c;

    /* renamed from: d */
    public final boolean f4036d;

    /* renamed from: e */
    @Nullable
    public final int[] f4037e = null;

    @RequiresApi
    public static final class CodepointIndexFinder {
    }

    public static final class ProcessorSm {

        /* renamed from: a */
        public int f4038a = 1;

        /* renamed from: b */
        public final MetadataRepo.Node f4039b;

        /* renamed from: c */
        public MetadataRepo.Node f4040c;

        /* renamed from: d */
        public MetadataRepo.Node f4041d;

        /* renamed from: e */
        public int f4042e;

        /* renamed from: f */
        public int f4043f;

        /* renamed from: g */
        public final boolean f4044g;

        /* renamed from: h */
        public final int[] f4045h;

        public ProcessorSm(MetadataRepo.Node node, boolean z, int[] iArr) {
            this.f4039b = node;
            this.f4040c = node;
            this.f4044g = z;
            this.f4045h = iArr;
        }

        /* renamed from: a */
        public int m2830a(int i2) {
            SparseArray<MetadataRepo.Node> sparseArray = this.f4040c.f4067a;
            MetadataRepo.Node node = sparseArray == null ? null : sparseArray.get(i2);
            int i3 = 3;
            if (this.f4038a == 2) {
                if (node != null) {
                    this.f4040c = node;
                    this.f4043f++;
                } else {
                    if (i2 == 65038) {
                        m2831b();
                    } else {
                        if (!(i2 == 65039)) {
                            MetadataRepo.Node node2 = this.f4040c;
                            if (node2.f4068b == null) {
                                m2831b();
                            } else if (this.f4043f != 1) {
                                this.f4041d = node2;
                                m2831b();
                            } else if (m2832c()) {
                                this.f4041d = this.f4040c;
                                m2831b();
                            } else {
                                m2831b();
                            }
                        }
                    }
                    i3 = 1;
                }
                i3 = 2;
            } else if (node == null) {
                m2831b();
                i3 = 1;
            } else {
                this.f4038a = 2;
                this.f4040c = node;
                this.f4043f = 1;
                i3 = 2;
            }
            this.f4042e = i2;
            return i3;
        }

        /* renamed from: b */
        public final int m2831b() {
            this.f4038a = 1;
            this.f4040c = this.f4039b;
            this.f4043f = 0;
            return 1;
        }

        /* renamed from: c */
        public final boolean m2832c() {
            MetadataItem m2827e = this.f4040c.f4068b.m2827e();
            int m2864a = m2827e.m2864a(6);
            if ((m2864a == 0 || m2827e.f4104b.get(m2864a + m2827e.f4103a) == 0) ? false : true) {
                return true;
            }
            if (this.f4042e == 65039) {
                return true;
            }
            if (this.f4044g) {
                if (this.f4045h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4045h, this.f4040c.f4068b.m2823a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z, @Nullable int[] iArr) {
        this.f4033a = spanFactory;
        this.f4034b = metadataRepo;
        this.f4035c = glyphChecker;
        this.f4036d = z;
    }

    /* renamed from: a */
    public static boolean m2828a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2829b(CharSequence charSequence, int i2, int i3, EmojiMetadata emojiMetadata) {
        if (emojiMetadata.f4032c == 0) {
            EmojiCompat.GlyphChecker glyphChecker = this.f4035c;
            MetadataItem m2827e = emojiMetadata.m2827e();
            int m2864a = m2827e.m2864a(8);
            emojiMetadata.f4032c = glyphChecker.mo2795a(charSequence, i2, i3, m2864a != 0 ? m2827e.f4104b.getShort(m2864a + m2827e.f4103a) : (short) 0) ? 2 : 1;
        }
        return emojiMetadata.f4032c == 2;
    }
}
