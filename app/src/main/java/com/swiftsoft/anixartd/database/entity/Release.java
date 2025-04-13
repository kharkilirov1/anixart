package com.swiftsoft.anixartd.database.entity;

import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Release.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0092\u0002\u001a\u00020\u001a2\n\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0094\u0002H\u0096\u0002J\t\u0010\u0095\u0002\u001a\u00020\u0006H\u0016J\t\u0010\u0096\u0002\u001a\u00020\u0011H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR \u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\u001e\u0010.\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\nR$\u00101\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR\u001c\u0010;\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015R\"\u0010>\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010D\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0013\"\u0004\bF\u0010\u0015R\u001c\u0010G\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u0010\u0015R\u001e\u0010J\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010\nR\u001a\u0010M\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\b\"\u0004\bO\u0010\nR \u0010P\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bW\u0010@\"\u0004\bX\u0010BR\"\u0010Y\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\bZ\u0010@\"\u0004\b[\u0010BR\u001e\u0010\\\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\b\"\u0004\b^\u0010\nR\u001c\u0010_\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0013\"\u0004\ba\u0010\u0015R\u001a\u0010b\u001a\u00020cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010h\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\b\"\u0004\bj\u0010\nR\u001e\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\r\"\u0004\bm\u0010\u000fR\u001c\u0010n\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0013\"\u0004\bp\u0010\u0015R\u001e\u0010q\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001c\"\u0004\br\u0010\u001eR\u001e\u0010s\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u001c\"\u0004\bt\u0010\u001eR\u001e\u0010u\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u001c\"\u0004\bv\u0010\u001eR\u001e\u0010w\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u001c\"\u0004\bx\u0010\u001eR\u001e\u0010y\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u001c\"\u0004\bz\u0010\u001eR\u001e\u0010{\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010\u001c\"\u0004\b|\u0010\u001eR\u001e\u0010}\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u001c\"\u0004\b~\u0010\u001eR\u001f\u0010\u007f\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u001c\"\u0005\b\u0080\u0001\u0010\u001eR!\u0010\u0081\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u001c\"\u0005\b\u0082\u0001\u0010\u001eR\u001d\u0010\u0083\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\r\"\u0005\b\u0085\u0001\u0010\u000fR\u001d\u0010\u0086\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\r\"\u0005\b\u0088\u0001\u0010\u000fR\u001d\u0010\u0089\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\r\"\u0005\b\u008b\u0001\u0010\u000fR\u001d\u0010\u008c\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\r\"\u0005\b\u008e\u0001\u0010\u000fR\u001d\u0010\u008f\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\r\"\u0005\b\u0091\u0001\u0010\u000fR\u001d\u0010\u0092\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\r\"\u0005\b\u0094\u0001\u0010\u000fR\u001d\u0010\u0095\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\r\"\u0005\b\u0097\u0001\u0010\u000fR%\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010C\u001a\u0005\b\u0099\u0001\u0010@\"\u0005\b\u009a\u0001\u0010BR&\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R#\u0010¡\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010\u0013\"\u0005\b£\u0001\u0010\u0015R#\u0010¤\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010\u0013\"\u0005\b¦\u0001\u0010\u0015R!\u0010§\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\r\"\u0005\b©\u0001\u0010\u000fR%\u0010ª\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010C\u001a\u0005\b«\u0001\u0010@\"\u0005\b¬\u0001\u0010BR\u001f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u0013\"\u0005\b¯\u0001\u0010\u0015R!\u0010°\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010\b\"\u0005\b²\u0001\u0010\nR!\u0010³\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010\b\"\u0005\bµ\u0001\u0010\nR!\u0010¶\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010\b\"\u0005\b¸\u0001\u0010\nR(\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030º\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u00105\"\u0005\b¼\u0001\u00107R\u001d\u0010½\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010\b\"\u0005\b¿\u0001\u0010\nR'\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020\u0000028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u00105\"\u0005\bÂ\u0001\u00107R&\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R!\u0010É\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010\r\"\u0005\bË\u0001\u0010\u000fR'\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020\u0000028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u00105\"\u0005\bÎ\u0001\u00107R#\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010\u0013\"\u0005\bÑ\u0001\u0010\u0015R'\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u0011028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÓ\u0001\u00105\"\u0005\bÔ\u0001\u00107R\u001d\u0010Õ\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\b\"\u0005\b×\u0001\u0010\nR&\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R!\u0010Þ\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bß\u0001\u0010\r\"\u0005\bà\u0001\u0010\u000fR\u001f\u0010á\u0001\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0001\u0010\u0013\"\u0005\bã\u0001\u0010\u0015R#\u0010ä\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bå\u0001\u0010\u0013\"\u0005\bæ\u0001\u0010\u0015R#\u0010ç\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0001\u0010\u0013\"\u0005\bé\u0001\u0010\u0015R#\u0010ê\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bë\u0001\u0010\u0013\"\u0005\bì\u0001\u0010\u0015R\u001f\u0010í\u0001\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010\u0013\"\u0005\bï\u0001\u0010\u0015R(\u0010ð\u0001\u001a\t\u0012\u0005\u0012\u00030ñ\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0001\u00105\"\u0005\bó\u0001\u00107R!\u0010ô\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bõ\u0001\u0010\b\"\u0005\bö\u0001\u0010\nR!\u0010÷\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0001\u0010\b\"\u0005\bù\u0001\u0010\nR!\u0010ú\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0001\u0010\b\"\u0005\bü\u0001\u0010\nR!\u0010ý\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010\b\"\u0005\bÿ\u0001\u0010\nR!\u0010\u0080\u0002\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0002\u0010\b\"\u0005\b\u0082\u0002\u0010\nR!\u0010\u0083\u0002\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0002\u0010\b\"\u0005\b\u0085\u0002\u0010\nR!\u0010\u0086\u0002\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0002\u0010\r\"\u0005\b\u0088\u0002\u0010\u000fR!\u0010\u0089\u0002\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010\b\"\u0005\b\u008b\u0002\u0010\nR\u001f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0002\u0010\u0013\"\u0005\b\u008e\u0002\u0010\u0015R%\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010C\u001a\u0005\b\u0090\u0002\u0010@\"\u0005\b\u0091\u0002\u0010B¨\u0006\u0097\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Release;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "ageRating", "", "getAgeRating", "()I", "setAgeRating", "(I)V", "airedOnDate", "getAiredOnDate", "()J", "setAiredOnDate", "(J)V", "author", "", "getAuthor", "()Ljava/lang/String;", "setAuthor", "(Ljava/lang/String;)V", "broadcast", "getBroadcast", "setBroadcast", "canTorlookSearch", "", "getCanTorlookSearch", "()Z", "setCanTorlookSearch", "(Z)V", "canVideoAppeal", "getCanVideoAppeal", "setCanVideoAppeal", "category", "Lcom/swiftsoft/anixartd/database/entity/Category;", "getCategory", "()Lcom/swiftsoft/anixartd/database/entity/Category;", "setCategory", "(Lcom/swiftsoft/anixartd/database/entity/Category;)V", "collectionCount", "getCollectionCount", "setCollectionCount", "commentCount", "getCommentCount", "setCommentCount", "commentPerDayCount", "getCommentPerDayCount", "setCommentPerDayCount", "comments", "", "Lcom/swiftsoft/anixartd/database/entity/ReleaseComment;", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "completedCount", "getCompletedCount", "setCompletedCount", "country", "getCountry", "setCountry", "creationDate", "getCreationDate", "()Ljava/lang/Integer;", "setCreationDate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "description", "getDescription", "setDescription", "director", "getDirector", "setDirector", "droppedCount", "getDroppedCount", "setDroppedCount", "duration", "getDuration", "setDuration", "episodeLastUpdate", "Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;", "getEpisodeLastUpdate", "()Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;", "setEpisodeLastUpdate", "(Lcom/swiftsoft/anixartd/database/entity/EpisodeUpdate;)V", "episodesReleased", "getEpisodesReleased", "setEpisodesReleased", "episodesTotal", "getEpisodesTotal", "setEpisodesTotal", "favoriteCount", "getFavoriteCount", "setFavoriteCount", "genres", "getGenres", "setGenres", "grade", "", "getGrade", "()D", "setGrade", "(D)V", "holdOnCount", "getHoldOnCount", "setHoldOnCount", "id", "getId", "setId", "image", "getImage", "setImage", "isAdult", "setAdult", "isDeleted", "setDeleted", "isFavorite", "setFavorite", "isPlayDisabled", "setPlayDisabled", "isReleaseTypeNotificationsEnabled", "setReleaseTypeNotificationsEnabled", "isRuBlocked", "setRuBlocked", "isThirdPartyPlatformsDisabled", "setThirdPartyPlatformsDisabled", "isViewBlocked", "setViewBlocked", "isViewed", "setViewed", "lastSetCompletedDate", "getLastSetCompletedDate", "setLastSetCompletedDate", "lastSetDroppedDate", "getLastSetDroppedDate", "setLastSetDroppedDate", "lastSetFavoriteDate", "getLastSetFavoriteDate", "setLastSetFavoriteDate", "lastSetHoldOnDate", "getLastSetHoldOnDate", "setLastSetHoldOnDate", "lastSetPlanDate", "getLastSetPlanDate", "setLastSetPlanDate", "lastSetViewedDate", "getLastSetViewedDate", "setLastSetViewedDate", "lastSetWatchingDate", "getLastSetWatchingDate", "setLastSetWatchingDate", "lastUpdateDate", "getLastUpdateDate", "setLastUpdateDate", "lastViewEpisode", "Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "getLastViewEpisode", "()Lcom/swiftsoft/anixartd/database/entity/episode/Episode;", "setLastViewEpisode", "(Lcom/swiftsoft/anixartd/database/entity/episode/Episode;)V", "lastViewEpisodeName", "getLastViewEpisodeName", "setLastViewEpisodeName", "lastViewEpisodeTypeName", "getLastViewEpisodeTypeName", "setLastViewEpisodeTypeName", "lastViewTimestamp", "getLastViewTimestamp", "setLastViewTimestamp", "myVote", "getMyVote", "setMyVote", "note", "getNote", "setNote", "planCount", "getPlanCount", "setPlanCount", "profileListStatus", "getProfileListStatus", "setProfileListStatus", "profileReleaseTypeNotificationPreferenceCount", "getProfileReleaseTypeNotificationPreferenceCount", "setProfileReleaseTypeNotificationPreferenceCount", "profileReleaseTypeNotificationPreferences", "Lcom/swiftsoft/anixartd/database/entity/ProfileReleaseTypeNotificationPreference;", "getProfileReleaseTypeNotificationPreferences", "setProfileReleaseTypeNotificationPreferences", "rating", "getRating", "setRating", "recommendedReleases", "getRecommendedReleases", "setRecommendedReleases", "related", "Lcom/swiftsoft/anixartd/database/entity/Related;", "getRelated", "()Lcom/swiftsoft/anixartd/database/entity/Related;", "setRelated", "(Lcom/swiftsoft/anixartd/database/entity/Related;)V", "relatedCount", "getRelatedCount", "setRelatedCount", "relatedReleases", "getRelatedReleases", "setRelatedReleases", "releaseDate", "getReleaseDate", "setReleaseDate", "screenshotImages", "getScreenshotImages", "setScreenshotImages", "season", "getSeason", "setSeason", "status", "Lcom/swiftsoft/anixartd/database/entity/ReleaseStatus;", "getStatus", "()Lcom/swiftsoft/anixartd/database/entity/ReleaseStatus;", "setStatus", "(Lcom/swiftsoft/anixartd/database/entity/ReleaseStatus;)V", "statusId", "getStatusId", "setStatusId", "studio", "getStudio", "setStudio", "titleAlt", "getTitleAlt", "setTitleAlt", "titleOriginal", "getTitleOriginal", "setTitleOriginal", "titleRu", "getTitleRu", "setTitleRu", "translators", "getTranslators", "setTranslators", "videoBanners", "Lcom/swiftsoft/anixartd/database/entity/ReleaseVideoBanner;", "getVideoBanners", "setVideoBanners", "vote1Count", "getVote1Count", "setVote1Count", "vote2Count", "getVote2Count", "setVote2Count", "vote3Count", "getVote3Count", "setVote3Count", "vote4Count", "getVote4Count", "setVote4Count", "vote5Count", "getVote5Count", "setVote5Count", "voteCount", "getVoteCount", "setVoteCount", "votedAt", "getVotedAt", "setVotedAt", "watchingCount", "getWatchingCount", "setWatchingCount", "year", "getYear", "setYear", "yourVote", "getYourVote", "setYourVote", "equals", "other", "", "hashCode", "toString", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
/* loaded from: classes2.dex */
public final class Release implements Identifiable<Long>, Serializable {

    @JsonProperty("age_rating")
    private int ageRating;

    @JsonProperty("aired_on_date")
    private long airedOnDate;

    @Nullable
    private String author;
    private int broadcast;

    @JsonProperty("can_torlook_search")
    private boolean canTorlookSearch;

    @JsonProperty("can_video_appeal")
    private boolean canVideoAppeal;

    @Ignore
    @Nullable
    private Category category;

    @JsonProperty("collection_count")
    private long collectionCount;

    @JsonProperty("comment_count")
    private long commentCount;

    @JsonProperty("comment_per_day_count")
    private int commentPerDayCount;

    @Ignore
    @NotNull
    private List<ReleaseComment> comments;

    @JsonProperty("completed_count")
    private int completedCount;

    @Nullable
    private String country;

    @Nullable
    private String description;

    @Nullable
    private String director;

    @JsonProperty("dropped_count")
    private int droppedCount;
    private int duration;

    @JsonProperty("episode_last_update")
    @Nullable
    private EpisodeUpdate episodeLastUpdate;

    @JsonProperty("episodes_total")
    @Nullable
    private Integer episodesTotal;

    @JsonProperty("favorites_count")
    private int favoriteCount;

    @Nullable
    private String genres;
    private double grade;

    @JsonProperty("hold_on_count")
    private int holdOnCount;

    @PrimaryKey
    private long id;

    @Nullable
    private String image;

    @JsonProperty("is_adult")
    private boolean isAdult;

    @JsonProperty("is_deleted")
    private boolean isDeleted;

    @JsonProperty("is_favorite")
    private boolean isFavorite;

    @JsonProperty("is_play_disabled")
    private boolean isPlayDisabled;

    @JsonProperty("is_release_type_notifications_enabled")
    private boolean isReleaseTypeNotificationsEnabled;

    @JsonProperty("is_ru_blocked")
    @Ignore
    private boolean isRuBlocked;

    @JsonProperty("is_tpp_disabled")
    private boolean isThirdPartyPlatformsDisabled;

    @JsonProperty("is_view_blocked")
    private boolean isViewBlocked;

    @JsonProperty("is_viewed")
    private boolean isViewed;
    private long lastSetCompletedDate;
    private long lastSetDroppedDate;
    private long lastSetFavoriteDate;
    private long lastSetHoldOnDate;
    private long lastSetPlanDate;
    private long lastSetViewedDate;
    private long lastSetWatchingDate;

    @JsonProperty("last_view_episode")
    @Ignore
    @Nullable
    private Episode lastViewEpisode;

    @JsonProperty("last_view_episode_name")
    @Nullable
    private String lastViewEpisodeName;

    @JsonProperty("last_view_episode_type_name")
    @Nullable
    private String lastViewEpisodeTypeName;

    @JsonProperty("last_view_timestamp")
    private long lastViewTimestamp;

    @Nullable
    private String note;

    @JsonProperty("plan_count")
    private int planCount;

    @JsonProperty("profile_list_status")
    private int profileListStatus;

    @JsonProperty("profile_release_type_notification_preference_count")
    private int profileReleaseTypeNotificationPreferenceCount;

    @JsonProperty("profile_release_type_notification_preferences")
    @NotNull
    private List<ProfileReleaseTypeNotificationPreference> profileReleaseTypeNotificationPreferences;
    private int rating;

    @JsonProperty("recommended_releases")
    @Ignore
    @NotNull
    private List<Release> recommendedReleases;

    @Ignore
    @Nullable
    private Related related;

    @JsonProperty("related_count")
    private long relatedCount;

    @JsonProperty("related_releases")
    @Ignore
    @NotNull
    private List<Release> relatedReleases;

    @JsonProperty("release_date")
    @Nullable
    private String releaseDate;

    @JsonProperty("screenshot_images")
    @Ignore
    @NotNull
    private List<String> screenshotImages;
    private int season;

    @Ignore
    @Nullable
    private ReleaseStatus status;

    @JsonProperty("status_id")
    private long statusId;

    @Nullable
    private String studio;

    @JsonProperty("title_original")
    @Nullable
    private String titleOriginal;

    @JsonProperty("title_ru")
    @Nullable
    private String titleRu;

    @Nullable
    private String translators;

    @JsonProperty("video_banners")
    @Ignore
    @NotNull
    private List<ReleaseVideoBanner> videoBanners;

    @JsonProperty("vote_1_count")
    private int vote1Count;

    @JsonProperty("vote_2_count")
    private int vote2Count;

    @JsonProperty("vote_3_count")
    private int vote3Count;

    @JsonProperty("vote_4_count")
    private int vote4Count;

    @JsonProperty("vote_5_count")
    private int vote5Count;

    @JsonProperty("vote_count")
    private int voteCount;

    @JsonProperty("voted_at")
    private long votedAt;

    @JsonProperty("watching_count")
    private int watchingCount;

    @Nullable
    private String year;

    @JsonProperty("title_alt")
    @Nullable
    private String titleAlt = "";

    @JsonProperty("episodes_released")
    @Nullable
    private Integer episodesReleased = 0;

    @JsonProperty("creation_date")
    @Nullable
    private Integer creationDate = 0;

    @JsonProperty("last_update_date")
    @Nullable
    private Integer lastUpdateDate = 0;

    @JsonProperty("your_vote")
    @Nullable
    private Integer yourVote = 0;

    @JsonProperty("my_vote")
    @Nullable
    private Integer myVote = 0;

    public Release() {
        EmptyList emptyList = EmptyList.f63144b;
        this.screenshotImages = emptyList;
        this.videoBanners = emptyList;
        this.relatedReleases = emptyList;
        this.recommendedReleases = emptyList;
        this.comments = emptyList;
        this.profileReleaseTypeNotificationPreferences = emptyList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Release.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
        Release release = (Release) other;
        if (this.id == release.id && Intrinsics.m32174c(this.titleOriginal, release.titleOriginal) && Intrinsics.m32174c(this.titleRu, release.titleRu) && Intrinsics.m32174c(this.titleAlt, release.titleAlt) && Intrinsics.m32174c(this.image, release.image) && Intrinsics.m32174c(this.year, release.year) && Intrinsics.m32174c(this.country, release.country) && Intrinsics.m32174c(this.episodesReleased, release.episodesReleased) && Intrinsics.m32174c(this.episodesTotal, release.episodesTotal) && Intrinsics.m32174c(this.releaseDate, release.releaseDate) && Intrinsics.m32174c(this.director, release.director) && Intrinsics.m32174c(this.author, release.author) && Intrinsics.m32174c(this.translators, release.translators) && Intrinsics.m32174c(this.studio, release.studio) && Intrinsics.m32174c(this.description, release.description) && Intrinsics.m32174c(this.note, release.note) && Intrinsics.m32174c(this.category, release.category) && Intrinsics.m32174c(this.genres, release.genres) && this.rating == release.rating && this.vote1Count == release.vote1Count && this.vote2Count == release.vote2Count && this.vote3Count == release.vote3Count && this.vote4Count == release.vote4Count && this.vote5Count == release.vote5Count && this.voteCount == release.voteCount) {
            return ((this.grade > release.grade ? 1 : (this.grade == release.grade ? 0 : -1)) == 0) && Intrinsics.m32174c(this.status, release.status) && Intrinsics.m32174c(this.creationDate, release.creationDate) && Intrinsics.m32174c(this.lastUpdateDate, release.lastUpdateDate) && this.airedOnDate == release.airedOnDate && this.favoriteCount == release.favoriteCount && this.watchingCount == release.watchingCount && this.planCount == release.planCount && this.completedCount == release.completedCount && this.holdOnCount == release.holdOnCount && this.droppedCount == release.droppedCount && this.isAdult == release.isAdult && this.isRuBlocked == release.isRuBlocked && this.isViewBlocked == release.isViewBlocked && this.isPlayDisabled == release.isPlayDisabled && this.isDeleted == release.isDeleted && this.duration == release.duration && this.season == release.season && this.broadcast == release.broadcast && this.ageRating == release.ageRating && Intrinsics.m32174c(this.yourVote, release.yourVote) && this.relatedCount == release.relatedCount && this.commentCount == release.commentCount && this.profileListStatus == release.profileListStatus && this.lastViewTimestamp == release.lastViewTimestamp && this.isViewed == release.isViewed && this.isFavorite == release.isFavorite && Intrinsics.m32174c(this.screenshotImages, release.screenshotImages) && this.lastSetViewedDate == release.lastSetViewedDate && this.lastSetFavoriteDate == release.lastSetFavoriteDate && this.lastSetWatchingDate == release.lastSetWatchingDate && this.lastSetPlanDate == release.lastSetPlanDate && this.lastSetCompletedDate == release.lastSetCompletedDate && this.lastSetHoldOnDate == release.lastSetHoldOnDate && this.lastSetDroppedDate == release.lastSetDroppedDate && Intrinsics.m32174c(this.episodeLastUpdate, release.episodeLastUpdate);
        }
        return false;
    }

    public final int getAgeRating() {
        return this.ageRating;
    }

    public final long getAiredOnDate() {
        return this.airedOnDate;
    }

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    public final int getBroadcast() {
        return this.broadcast;
    }

    public final boolean getCanTorlookSearch() {
        return this.canTorlookSearch;
    }

    public final boolean getCanVideoAppeal() {
        return this.canVideoAppeal;
    }

    @Nullable
    public final Category getCategory() {
        return this.category;
    }

    public final long getCollectionCount() {
        return this.collectionCount;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final int getCommentPerDayCount() {
        return this.commentPerDayCount;
    }

    @NotNull
    public final List<ReleaseComment> getComments() {
        return this.comments;
    }

    public final int getCompletedCount() {
        return this.completedCount;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Integer getCreationDate() {
        return this.creationDate;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDirector() {
        return this.director;
    }

    public final int getDroppedCount() {
        return this.droppedCount;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final EpisodeUpdate getEpisodeLastUpdate() {
        return this.episodeLastUpdate;
    }

    @Nullable
    public final Integer getEpisodesReleased() {
        return this.episodesReleased;
    }

    @Nullable
    public final Integer getEpisodesTotal() {
        return this.episodesTotal;
    }

    public final int getFavoriteCount() {
        return this.favoriteCount;
    }

    @Nullable
    public final String getGenres() {
        return this.genres;
    }

    public final double getGrade() {
        return this.grade;
    }

    public final int getHoldOnCount() {
        return this.holdOnCount;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final long getLastSetCompletedDate() {
        return this.lastSetCompletedDate;
    }

    public final long getLastSetDroppedDate() {
        return this.lastSetDroppedDate;
    }

    public final long getLastSetFavoriteDate() {
        return this.lastSetFavoriteDate;
    }

    public final long getLastSetHoldOnDate() {
        return this.lastSetHoldOnDate;
    }

    public final long getLastSetPlanDate() {
        return this.lastSetPlanDate;
    }

    public final long getLastSetViewedDate() {
        return this.lastSetViewedDate;
    }

    public final long getLastSetWatchingDate() {
        return this.lastSetWatchingDate;
    }

    @Nullable
    public final Integer getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    @Nullable
    public final Episode getLastViewEpisode() {
        return this.lastViewEpisode;
    }

    @Nullable
    public final String getLastViewEpisodeName() {
        return this.lastViewEpisodeName;
    }

    @Nullable
    public final String getLastViewEpisodeTypeName() {
        return this.lastViewEpisodeTypeName;
    }

    public final long getLastViewTimestamp() {
        return this.lastViewTimestamp;
    }

    @Nullable
    public final Integer getMyVote() {
        return this.myVote;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    public final int getPlanCount() {
        return this.planCount;
    }

    public final int getProfileListStatus() {
        return this.profileListStatus;
    }

    public final int getProfileReleaseTypeNotificationPreferenceCount() {
        return this.profileReleaseTypeNotificationPreferenceCount;
    }

    @NotNull
    public final List<ProfileReleaseTypeNotificationPreference> getProfileReleaseTypeNotificationPreferences() {
        return this.profileReleaseTypeNotificationPreferences;
    }

    public final int getRating() {
        return this.rating;
    }

    @NotNull
    public final List<Release> getRecommendedReleases() {
        return this.recommendedReleases;
    }

    @Nullable
    public final Related getRelated() {
        return this.related;
    }

    public final long getRelatedCount() {
        return this.relatedCount;
    }

    @NotNull
    public final List<Release> getRelatedReleases() {
        return this.relatedReleases;
    }

    @Nullable
    public final String getReleaseDate() {
        return this.releaseDate;
    }

    @NotNull
    public final List<String> getScreenshotImages() {
        return this.screenshotImages;
    }

    public final int getSeason() {
        return this.season;
    }

    @Nullable
    public final ReleaseStatus getStatus() {
        return this.status;
    }

    public final long getStatusId() {
        return this.statusId;
    }

    @Nullable
    public final String getStudio() {
        return this.studio;
    }

    @Nullable
    public final String getTitleAlt() {
        return this.titleAlt;
    }

    @Nullable
    public final String getTitleOriginal() {
        return this.titleOriginal;
    }

    @Nullable
    public final String getTitleRu() {
        return this.titleRu;
    }

    @Nullable
    public final String getTranslators() {
        return this.translators;
    }

    @NotNull
    public final List<ReleaseVideoBanner> getVideoBanners() {
        return this.videoBanners;
    }

    public final int getVote1Count() {
        return this.vote1Count;
    }

    public final int getVote2Count() {
        return this.vote2Count;
    }

    public final int getVote3Count() {
        return this.vote3Count;
    }

    public final int getVote4Count() {
        return this.vote4Count;
    }

    public final int getVote5Count() {
        return this.vote5Count;
    }

    public final int getVoteCount() {
        return this.voteCount;
    }

    public final long getVotedAt() {
        return this.votedAt;
    }

    public final int getWatchingCount() {
        return this.watchingCount;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    @Nullable
    public final Integer getYourVote() {
        return this.yourVote;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isAdult, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: isPlayDisabled, reason: from getter */
    public final boolean getIsPlayDisabled() {
        return this.isPlayDisabled;
    }

    /* renamed from: isReleaseTypeNotificationsEnabled, reason: from getter */
    public final boolean getIsReleaseTypeNotificationsEnabled() {
        return this.isReleaseTypeNotificationsEnabled;
    }

    /* renamed from: isRuBlocked, reason: from getter */
    public final boolean getIsRuBlocked() {
        return this.isRuBlocked;
    }

    /* renamed from: isThirdPartyPlatformsDisabled, reason: from getter */
    public final boolean getIsThirdPartyPlatformsDisabled() {
        return this.isThirdPartyPlatformsDisabled;
    }

    /* renamed from: isViewBlocked, reason: from getter */
    public final boolean getIsViewBlocked() {
        return this.isViewBlocked;
    }

    /* renamed from: isViewed, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    public final void setAdult(boolean z) {
        this.isAdult = z;
    }

    public final void setAgeRating(int i2) {
        this.ageRating = i2;
    }

    public final void setAiredOnDate(long j2) {
        this.airedOnDate = j2;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setBroadcast(int i2) {
        this.broadcast = i2;
    }

    public final void setCanTorlookSearch(boolean z) {
        this.canTorlookSearch = z;
    }

    public final void setCanVideoAppeal(boolean z) {
        this.canVideoAppeal = z;
    }

    public final void setCategory(@Nullable Category category) {
        this.category = category;
    }

    public final void setCollectionCount(long j2) {
        this.collectionCount = j2;
    }

    public final void setCommentCount(long j2) {
        this.commentCount = j2;
    }

    public final void setCommentPerDayCount(int i2) {
        this.commentPerDayCount = i2;
    }

    public final void setComments(@NotNull List<ReleaseComment> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.comments = list;
    }

    public final void setCompletedCount(int i2) {
        this.completedCount = i2;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setCreationDate(@Nullable Integer num) {
        this.creationDate = num;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDirector(@Nullable String str) {
        this.director = str;
    }

    public final void setDroppedCount(int i2) {
        this.droppedCount = i2;
    }

    public final void setDuration(int i2) {
        this.duration = i2;
    }

    public final void setEpisodeLastUpdate(@Nullable EpisodeUpdate episodeUpdate) {
        this.episodeLastUpdate = episodeUpdate;
    }

    public final void setEpisodesReleased(@Nullable Integer num) {
        this.episodesReleased = num;
    }

    public final void setEpisodesTotal(@Nullable Integer num) {
        this.episodesTotal = num;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    public final void setFavoriteCount(int i2) {
        this.favoriteCount = i2;
    }

    public final void setGenres(@Nullable String str) {
        this.genres = str;
    }

    public final void setGrade(double d) {
        this.grade = d;
    }

    public final void setHoldOnCount(int i2) {
        this.holdOnCount = i2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setLastSetCompletedDate(long j2) {
        this.lastSetCompletedDate = j2;
    }

    public final void setLastSetDroppedDate(long j2) {
        this.lastSetDroppedDate = j2;
    }

    public final void setLastSetFavoriteDate(long j2) {
        this.lastSetFavoriteDate = j2;
    }

    public final void setLastSetHoldOnDate(long j2) {
        this.lastSetHoldOnDate = j2;
    }

    public final void setLastSetPlanDate(long j2) {
        this.lastSetPlanDate = j2;
    }

    public final void setLastSetViewedDate(long j2) {
        this.lastSetViewedDate = j2;
    }

    public final void setLastSetWatchingDate(long j2) {
        this.lastSetWatchingDate = j2;
    }

    public final void setLastUpdateDate(@Nullable Integer num) {
        this.lastUpdateDate = num;
    }

    public final void setLastViewEpisode(@Nullable Episode episode) {
        this.lastViewEpisode = episode;
    }

    public final void setLastViewEpisodeName(@Nullable String str) {
        this.lastViewEpisodeName = str;
    }

    public final void setLastViewEpisodeTypeName(@Nullable String str) {
        this.lastViewEpisodeTypeName = str;
    }

    public final void setLastViewTimestamp(long j2) {
        this.lastViewTimestamp = j2;
    }

    public final void setMyVote(@Nullable Integer num) {
        this.myVote = num;
    }

    public final void setNote(@Nullable String str) {
        this.note = str;
    }

    public final void setPlanCount(int i2) {
        this.planCount = i2;
    }

    public final void setPlayDisabled(boolean z) {
        this.isPlayDisabled = z;
    }

    public final void setProfileListStatus(int i2) {
        this.profileListStatus = i2;
    }

    public final void setProfileReleaseTypeNotificationPreferenceCount(int i2) {
        this.profileReleaseTypeNotificationPreferenceCount = i2;
    }

    public final void setProfileReleaseTypeNotificationPreferences(@NotNull List<ProfileReleaseTypeNotificationPreference> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.profileReleaseTypeNotificationPreferences = list;
    }

    public final void setRating(int i2) {
        this.rating = i2;
    }

    public final void setRecommendedReleases(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.recommendedReleases = list;
    }

    public final void setRelated(@Nullable Related related) {
        this.related = related;
    }

    public final void setRelatedCount(long j2) {
        this.relatedCount = j2;
    }

    public final void setRelatedReleases(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.relatedReleases = list;
    }

    public final void setReleaseDate(@Nullable String str) {
        this.releaseDate = str;
    }

    public final void setReleaseTypeNotificationsEnabled(boolean z) {
        this.isReleaseTypeNotificationsEnabled = z;
    }

    public final void setRuBlocked(boolean z) {
        this.isRuBlocked = z;
    }

    public final void setScreenshotImages(@NotNull List<String> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.screenshotImages = list;
    }

    public final void setSeason(int i2) {
        this.season = i2;
    }

    public final void setStatus(@Nullable ReleaseStatus releaseStatus) {
        this.status = releaseStatus;
    }

    public final void setStatusId(long j2) {
        this.statusId = j2;
    }

    public final void setStudio(@Nullable String str) {
        this.studio = str;
    }

    public final void setThirdPartyPlatformsDisabled(boolean z) {
        this.isThirdPartyPlatformsDisabled = z;
    }

    public final void setTitleAlt(@Nullable String str) {
        this.titleAlt = str;
    }

    public final void setTitleOriginal(@Nullable String str) {
        this.titleOriginal = str;
    }

    public final void setTitleRu(@Nullable String str) {
        this.titleRu = str;
    }

    public final void setTranslators(@Nullable String str) {
        this.translators = str;
    }

    public final void setVideoBanners(@NotNull List<ReleaseVideoBanner> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.videoBanners = list;
    }

    public final void setViewBlocked(boolean z) {
        this.isViewBlocked = z;
    }

    public final void setViewed(boolean z) {
        this.isViewed = z;
    }

    public final void setVote1Count(int i2) {
        this.vote1Count = i2;
    }

    public final void setVote2Count(int i2) {
        this.vote2Count = i2;
    }

    public final void setVote3Count(int i2) {
        this.vote3Count = i2;
    }

    public final void setVote4Count(int i2) {
        this.vote4Count = i2;
    }

    public final void setVote5Count(int i2) {
        this.vote5Count = i2;
    }

    public final void setVoteCount(int i2) {
        this.voteCount = i2;
    }

    public final void setVotedAt(long j2) {
        this.votedAt = j2;
    }

    public final void setWatchingCount(int i2) {
        this.watchingCount = i2;
    }

    public final void setYear(@Nullable String str) {
        this.year = str;
    }

    public final void setYourVote(@Nullable Integer num) {
        this.yourVote = num;
    }

    @NotNull
    public String toString() {
        return this.id + ' ' + this.titleRu;
    }
}
