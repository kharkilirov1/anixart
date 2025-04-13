package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import androidx.recyclerview.widget.RecyclerView;

@AnyThread
@RequiresApi
/* loaded from: classes.dex */
public final class MetadataRepo {

    /* renamed from: a */
    @NonNull
    public final MetadataList f4063a;

    /* renamed from: b */
    @NonNull
    public final char[] f4064b;

    /* renamed from: c */
    @NonNull
    public final Node f4065c = new Node(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);

    /* renamed from: d */
    @NonNull
    public final Typeface f4066d;

    public MetadataRepo(@NonNull Typeface typeface, @NonNull MetadataList metadataList) {
        this.f4066d = typeface;
        this.f4063a = metadataList;
        this.f4064b = new char[metadataList.m2863c() * 2];
        int m2863c = metadataList.m2863c();
        for (int i2 = 0; i2 < m2863c; i2++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i2);
            Character.toChars(emojiMetadata.m2826d(), this.f4064b, i2 * 2);
            Preconditions.m2028a(emojiMetadata.m2824b() > 0, "invalid metadata codepoint length");
            this.f4065c.m2842a(emojiMetadata, 0, emojiMetadata.m2824b() - 1);
        }
    }

    @RestrictTo
    public static class Node {

        /* renamed from: a */
        public final SparseArray<Node> f4067a;

        /* renamed from: b */
        public EmojiMetadata f4068b;

        public Node() {
            this.f4067a = new SparseArray<>(1);
        }

        /* renamed from: a */
        public void m2842a(@NonNull EmojiMetadata emojiMetadata, int i2, int i3) {
            int m2823a = emojiMetadata.m2823a(i2);
            SparseArray<Node> sparseArray = this.f4067a;
            Node node = sparseArray == null ? null : sparseArray.get(m2823a);
            if (node == null) {
                node = new Node();
                this.f4067a.put(emojiMetadata.m2823a(i2), node);
            }
            if (i3 > i2) {
                node.m2842a(emojiMetadata, i2 + 1, i3);
            } else {
                node.f4068b = emojiMetadata;
            }
        }

        public Node(int i2) {
            this.f4067a = new SparseArray<>(i2);
        }
    }
}
