package com.yandex.div.core.player;

import android.content.Context;
import com.yandex.div.core.player.DivPlayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPlayerFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface DivPlayerFactory {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final DivPlayerFactory f31294a = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        /* renamed from: a */
        public DivPlayerView mo16698a(final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                @Override // com.yandex.div.core.player.DivPlayerView
                @Nullable
                public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
                    return null;
                }
            };
        }

        @Override // com.yandex.div.core.player.DivPlayerFactory
        /* renamed from: b */
        public DivPlayer mo16699b(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
                @Override // com.yandex.div.core.player.DivPlayer
                /* renamed from: a */
                public /* synthetic */ void mo16696a(long j2) {
                }

                @Override // com.yandex.div.core.player.DivPlayer
                /* renamed from: b */
                public void mo16697b(DivPlayer.Observer observer) {
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void pause() {
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void play() {
                }
            };
        }
    };

    /* compiled from: DivPlayerFactory.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/player/DivPlayerFactory$Companion;", "", "Lcom/yandex/div/core/player/DivPlayerFactory;", "STUB", "Lcom/yandex/div/core/player/DivPlayerFactory;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @NotNull
    /* renamed from: a */
    DivPlayerView mo16698a(@NotNull Context context);

    @NotNull
    /* renamed from: b */
    DivPlayer mo16699b(@NotNull List<DivVideoSource> list, @NotNull DivPlayerPlaybackConfig divPlayerPlaybackConfig);
}
