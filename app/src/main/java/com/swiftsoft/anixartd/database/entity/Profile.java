package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.swiftsoft.anixartd.database.util.Identifiable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Profile.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 ´\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002´\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010°\u0001\u001a\u00020E2\n\u0010±\u0001\u001a\u0005\u0018\u00010²\u0001H\u0096\u0002J\t\u0010³\u0001\u001a\u00020\u0017H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u001e\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001e\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u001e\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001e\u0010(\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001e\u0010+\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\"\u0010.\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\b\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001e\u0010>\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\r\"\u0004\b@\u0010\u000fR\u001e\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\b\"\u0004\bC\u0010\nR\u001e\u0010D\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010HR\u001e\u0010K\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\u001e\u0010M\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR\u001e\u0010O\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\u001e\u0010Q\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010F\"\u0004\bR\u0010HR\u001e\u0010S\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\u001e\u0010U\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010F\"\u0004\bV\u0010HR\u001e\u0010W\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010F\"\u0004\bX\u0010HR\u001e\u0010Y\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010HR\u001e\u0010[\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010HR\u001e\u0010]\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010F\"\u0004\b^\u0010HR\u001e\u0010_\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010F\"\u0004\b`\u0010HR\u001e\u0010a\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010F\"\u0004\bb\u0010HR\u001e\u0010c\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010F\"\u0004\bd\u0010HR\u001e\u0010e\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010F\"\u0004\bf\u0010HR\u001e\u0010g\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010F\"\u0004\bh\u0010HR\u001e\u0010i\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010F\"\u0004\bj\u0010HR\u001e\u0010k\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\r\"\u0004\bm\u0010\u000fR\u001a\u0010n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\b\"\u0004\bp\u0010\nR\u001a\u0010q\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\b\"\u0004\bs\u0010\nR\u001e\u0010t\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0019\"\u0004\bv\u0010\u001bR\u001e\u0010w\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\r\"\u0004\by\u0010\u000fR\u001a\u0010z\u001a\u00020{X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR!\u0010\u0080\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u0019\"\u0005\b\u0082\u0001\u0010\u001bR!\u0010\u0083\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\r\"\u0005\b\u0085\u0001\u0010\u000fR)\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00108\"\u0005\b\u008a\u0001\u0010:R\u001d\u0010\u008b\u0001\u001a\u00020\u0002X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\r\"\u0005\b\u008d\u0001\u0010\u000fR\u001d\u0010\u008e\u0001\u001a\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\b\"\u0005\b\u0090\u0001\u0010\nR!\u0010\u0091\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\b\"\u0005\b\u0093\u0001\u0010\nR!\u0010\u0094\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010\b\"\u0005\b\u0096\u0001\u0010\nR!\u0010\u0097\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010\u0019\"\u0005\b\u0099\u0001\u0010\u001bR!\u0010\u009a\u0001\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010\b\"\u0005\b\u009c\u0001\u0010\nR!\u0010\u009d\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010\u0019\"\u0005\b\u009f\u0001\u0010\u001bR'\u0010 \u0001\u001a\b\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u00108\"\u0005\b¢\u0001\u0010:R)\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u0087\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u00108\"\u0005\b¦\u0001\u0010:R!\u0010§\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010\r\"\u0005\b©\u0001\u0010\u000fR!\u0010ª\u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010\r\"\u0005\b¬\u0001\u0010\u000fR!\u0010\u00ad\u0001\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010\u0019\"\u0005\b¯\u0001\u0010\u001b¨\u0006µ\u0001"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/Profile;", "Lcom/swiftsoft/anixartd/database/util/Identifiable;", "", "Ljava/io/Serializable;", "()V", "avatar", "", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "banExpires", "getBanExpires", "()J", "setBanExpires", "(J)V", "banReason", "getBanReason", "setBanReason", "blockListAddedDate", "getBlockListAddedDate", "setBlockListAddedDate", "collectionCount", "", "getCollectionCount", "()I", "setCollectionCount", "(I)V", "commentCount", "getCommentCount", "setCommentCount", "completedCount", "getCompletedCount", "setCompletedCount", "discordPage", "getDiscordPage", "setDiscordPage", "droppedCount", "getDroppedCount", "setDroppedCount", "favoriteCount", "getFavoriteCount", "setFavoriteCount", "friendCount", "getFriendCount", "setFriendCount", "friendStatus", "getFriendStatus", "()Ljava/lang/Integer;", "setFriendStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "history", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getHistory", "()Ljava/util/List;", "setHistory", "(Ljava/util/List;)V", "holdOnCount", "getHoldOnCount", "setHoldOnCount", "id", "getId", "setId", "instPage", "getInstPage", "setInstPage", "isBanned", "", "()Z", "setBanned", "(Z)V", "isBlocked", "setBlocked", "isCommentNotificationsEnabled", "setCommentNotificationsEnabled", "isCountsHidden", "setCountsHidden", "isEpisodeNotificationsEnabled", "setEpisodeNotificationsEnabled", "isFirstEpisodeNotificationEnabled", "setFirstEpisodeNotificationEnabled", "isFriendRequestsDisallowed", "setFriendRequestsDisallowed", "isGoogleBound", "setGoogleBound", "isLoginChanged", "setLoginChanged", "isMeBlocked", "setMeBlocked", "isOnline", "setOnline", "isPermBanned", "setPermBanned", "isSocial", "setSocial", "isSocialHidden", "setSocialHidden", "isSponsor", "setSponsor", "isStatsHidden", "setStatsHidden", "isVerified", "setVerified", "isVkBound", "setVkBound", "lastActivityTime", "getLastActivityTime", "setLastActivityTime", "login", "getLogin", "setLogin", "password", "getPassword", "setPassword", "planCount", "getPlanCount", "setPlanCount", "privilegeLevel", "getPrivilegeLevel", "setPrivilegeLevel", "profileToken", "Lcom/swiftsoft/anixartd/database/entity/ProfileToken;", "getProfileToken", "()Lcom/swiftsoft/anixartd/database/entity/ProfileToken;", "setProfileToken", "(Lcom/swiftsoft/anixartd/database/entity/ProfileToken;)V", "ratingScore", "getRatingScore", "setRatingScore", "registerDate", "getRegisterDate", "setRegisterDate", "roles", "", "Lcom/swiftsoft/anixartd/database/entity/Role;", "getRoles", "setRoles", "sponsorshipExpires", "getSponsorshipExpires", "setSponsorshipExpires", "status", "getStatus", "setStatus", "tgPage", "getTgPage", "setTgPage", "ttPage", "getTtPage", "setTtPage", "videoCount", "getVideoCount", "setVideoCount", "vkPage", "getVkPage", "setVkPage", "vote", "getVote", "setVote", "votes", "getVotes", "setVotes", "watchDynamics", "Lcom/swiftsoft/anixartd/database/entity/ProfileWatchDynamics;", "getWatchDynamics", "setWatchDynamics", "watchedEpisodeCount", "getWatchedEpisodeCount", "setWatchedEpisodeCount", "watchedTime", "getWatchedTime", "setWatchedTime", "watchingCount", "getWatchingCount", "setWatchingCount", "equals", "other", "", "hashCode", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
@Entity
/* loaded from: classes2.dex */
public final class Profile implements Identifiable<Long>, Serializable {
    public static final long ADMINISTRATOR = 4;
    public static final long DEVELOPER = 5;
    public static final long MEMBER = 1;
    public static final long MODERATOR = 3;
    public static final long NONE = 0;
    public static final long RELEASER = 2;

    @JsonProperty("ban_expires")
    private long banExpires;

    @JsonProperty("ban_reason")
    @Nullable
    private String banReason;

    @JsonProperty("added_date")
    private long blockListAddedDate;

    @JsonProperty("collection_count")
    private int collectionCount;

    @JsonProperty("comment_count")
    private int commentCount;

    @JsonProperty("completed_count")
    private int completedCount;

    @JsonProperty("dropped_count")
    private int droppedCount;

    @JsonProperty("favorite_count")
    private int favoriteCount;

    @JsonProperty("friend_count")
    private int friendCount;

    @JsonProperty("friend_status")
    @Nullable
    private Integer friendStatus;

    @Ignore
    @NotNull
    private List<Release> history;

    @JsonProperty("hold_on_count")
    private int holdOnCount;

    @PrimaryKey
    private long id;

    @JsonProperty("is_banned")
    private boolean isBanned;

    @JsonProperty("is_blocked")
    private boolean isBlocked;

    @JsonProperty("is_comment_notifications_enabled")
    private boolean isCommentNotificationsEnabled;

    @JsonProperty("is_counts_hidden")
    private boolean isCountsHidden;

    @JsonProperty("is_episode_notifications_enabled")
    private boolean isEpisodeNotificationsEnabled;

    @JsonProperty("is_first_episode_notification_enabled")
    private boolean isFirstEpisodeNotificationEnabled;

    @JsonProperty("is_friend_requests_disallowed")
    private boolean isFriendRequestsDisallowed;

    @JsonProperty("is_google_bound")
    private boolean isGoogleBound;

    @JsonProperty("is_login_changed")
    private boolean isLoginChanged;

    @JsonProperty("is_me_blocked")
    private boolean isMeBlocked;

    @JsonProperty("is_online")
    private boolean isOnline;

    @JsonProperty("is_perm_banned")
    private boolean isPermBanned;

    @JsonProperty("is_social")
    private boolean isSocial;

    @JsonProperty("is_social_hidden")
    private boolean isSocialHidden;

    @JsonProperty("is_sponsor")
    private boolean isSponsor;

    @JsonProperty("is_stats_hidden")
    private boolean isStatsHidden;

    @JsonProperty("is_verified")
    private boolean isVerified;

    @JsonProperty("is_vk_bound")
    private boolean isVkBound;

    @JsonProperty("last_activity_time")
    private long lastActivityTime;

    @JsonProperty("plan_count")
    private int planCount;

    @JsonProperty("privilege_level")
    private long privilegeLevel;
    public ProfileToken profileToken;

    @JsonProperty("rating_score")
    private int ratingScore;

    @JsonProperty("register_date")
    private long registerDate;
    private long sponsorshipExpires;

    @JsonProperty("video_count")
    private int videoCount;

    @Ignore
    private int vote;

    @Ignore
    @NotNull
    private List<Release> votes;

    @JsonProperty("watched_episode_count")
    private long watchedEpisodeCount;

    @JsonProperty("watched_time")
    private long watchedTime;

    @JsonProperty("watching_count")
    private int watchingCount;

    @NotNull
    private String login = "";

    @NotNull
    private String password = "";

    @NotNull
    private String avatar = "";

    @NotNull
    private String status = "";

    @JsonProperty("vk_page")
    @NotNull
    private String vkPage = "";

    @JsonProperty("tg_page")
    @NotNull
    private String tgPage = "";

    @JsonProperty("inst_page")
    @NotNull
    private String instPage = "";

    @JsonProperty("tt_page")
    @NotNull
    private String ttPage = "";

    @JsonProperty("discord_page")
    @NotNull
    private String discordPage = "";

    @JsonProperty("watch_dynamics")
    @Ignore
    @NotNull
    private List<ProfileWatchDynamics> watchDynamics = new ArrayList();

    @JsonProperty("roles")
    @Ignore
    @NotNull
    private List<Role> roles = new ArrayList();

    public Profile() {
        EmptyList emptyList = EmptyList.f63144b;
        this.history = emptyList;
        this.votes = emptyList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m32174c(Profile.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m32177f(other, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Profile");
        Profile profile = (Profile) other;
        return this.id == profile.id && Intrinsics.m32174c(this.login, profile.login) && Intrinsics.m32174c(this.password, profile.password) && Intrinsics.m32174c(this.avatar, profile.avatar) && Intrinsics.m32174c(this.status, profile.status) && this.privilegeLevel == profile.privilegeLevel && this.watchingCount == profile.watchingCount && this.planCount == profile.planCount && this.completedCount == profile.completedCount && this.holdOnCount == profile.holdOnCount && this.droppedCount == profile.droppedCount && this.favoriteCount == profile.favoriteCount && this.commentCount == profile.commentCount && this.collectionCount == profile.collectionCount && this.friendCount == profile.friendCount && this.lastActivityTime == profile.lastActivityTime && this.registerDate == profile.registerDate && this.ratingScore == profile.ratingScore && this.isStatsHidden == profile.isStatsHidden && this.isCountsHidden == profile.isCountsHidden && this.isSocialHidden == profile.isSocialHidden && this.isFriendRequestsDisallowed == profile.isFriendRequestsDisallowed && this.isSponsor == profile.isSponsor && this.isVerified == profile.isVerified && this.isOnline == profile.isOnline && this.isVkBound == profile.isVkBound && this.isGoogleBound == profile.isGoogleBound;
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    public final long getBanExpires() {
        return this.banExpires;
    }

    @Nullable
    public final String getBanReason() {
        return this.banReason;
    }

    public final long getBlockListAddedDate() {
        return this.blockListAddedDate;
    }

    public final int getCollectionCount() {
        return this.collectionCount;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final int getCompletedCount() {
        return this.completedCount;
    }

    @NotNull
    public final String getDiscordPage() {
        return this.discordPage;
    }

    public final int getDroppedCount() {
        return this.droppedCount;
    }

    public final int getFavoriteCount() {
        return this.favoriteCount;
    }

    public final int getFriendCount() {
        return this.friendCount;
    }

    @Nullable
    public final Integer getFriendStatus() {
        return this.friendStatus;
    }

    @NotNull
    public final List<Release> getHistory() {
        return this.history;
    }

    public final int getHoldOnCount() {
        return this.holdOnCount;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getInstPage() {
        return this.instPage;
    }

    public final long getLastActivityTime() {
        return this.lastActivityTime;
    }

    @NotNull
    public final String getLogin() {
        return this.login;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public final int getPlanCount() {
        return this.planCount;
    }

    public final long getPrivilegeLevel() {
        return this.privilegeLevel;
    }

    @NotNull
    public final ProfileToken getProfileToken() {
        ProfileToken profileToken = this.profileToken;
        if (profileToken != null) {
            return profileToken;
        }
        Intrinsics.m32189r("profileToken");
        throw null;
    }

    public final int getRatingScore() {
        return this.ratingScore;
    }

    public final long getRegisterDate() {
        return this.registerDate;
    }

    @NotNull
    public final List<Role> getRoles() {
        return this.roles;
    }

    public final long getSponsorshipExpires() {
        return this.sponsorshipExpires;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTgPage() {
        return this.tgPage;
    }

    @NotNull
    public final String getTtPage() {
        return this.ttPage;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    @NotNull
    public final String getVkPage() {
        return this.vkPage;
    }

    public final int getVote() {
        return this.vote;
    }

    @NotNull
    public final List<Release> getVotes() {
        return this.votes;
    }

    @NotNull
    public final List<ProfileWatchDynamics> getWatchDynamics() {
        return this.watchDynamics;
    }

    public final long getWatchedEpisodeCount() {
        return this.watchedEpisodeCount;
    }

    public final long getWatchedTime() {
        return this.watchedTime;
    }

    public final int getWatchingCount() {
        return this.watchingCount;
    }

    public int hashCode() {
        long j2 = this.id;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: isBanned, reason: from getter */
    public final boolean getIsBanned() {
        return this.isBanned;
    }

    /* renamed from: isBlocked, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* renamed from: isCommentNotificationsEnabled, reason: from getter */
    public final boolean getIsCommentNotificationsEnabled() {
        return this.isCommentNotificationsEnabled;
    }

    /* renamed from: isCountsHidden, reason: from getter */
    public final boolean getIsCountsHidden() {
        return this.isCountsHidden;
    }

    /* renamed from: isEpisodeNotificationsEnabled, reason: from getter */
    public final boolean getIsEpisodeNotificationsEnabled() {
        return this.isEpisodeNotificationsEnabled;
    }

    /* renamed from: isFirstEpisodeNotificationEnabled, reason: from getter */
    public final boolean getIsFirstEpisodeNotificationEnabled() {
        return this.isFirstEpisodeNotificationEnabled;
    }

    /* renamed from: isFriendRequestsDisallowed, reason: from getter */
    public final boolean getIsFriendRequestsDisallowed() {
        return this.isFriendRequestsDisallowed;
    }

    /* renamed from: isGoogleBound, reason: from getter */
    public final boolean getIsGoogleBound() {
        return this.isGoogleBound;
    }

    /* renamed from: isLoginChanged, reason: from getter */
    public final boolean getIsLoginChanged() {
        return this.isLoginChanged;
    }

    /* renamed from: isMeBlocked, reason: from getter */
    public final boolean getIsMeBlocked() {
        return this.isMeBlocked;
    }

    /* renamed from: isOnline, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* renamed from: isPermBanned, reason: from getter */
    public final boolean getIsPermBanned() {
        return this.isPermBanned;
    }

    /* renamed from: isSocial, reason: from getter */
    public final boolean getIsSocial() {
        return this.isSocial;
    }

    /* renamed from: isSocialHidden, reason: from getter */
    public final boolean getIsSocialHidden() {
        return this.isSocialHidden;
    }

    /* renamed from: isSponsor, reason: from getter */
    public final boolean getIsSponsor() {
        return this.isSponsor;
    }

    /* renamed from: isStatsHidden, reason: from getter */
    public final boolean getIsStatsHidden() {
        return this.isStatsHidden;
    }

    /* renamed from: isVerified, reason: from getter */
    public final boolean getIsVerified() {
        return this.isVerified;
    }

    /* renamed from: isVkBound, reason: from getter */
    public final boolean getIsVkBound() {
        return this.isVkBound;
    }

    public final void setAvatar(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.avatar = str;
    }

    public final void setBanExpires(long j2) {
        this.banExpires = j2;
    }

    public final void setBanReason(@Nullable String str) {
        this.banReason = str;
    }

    public final void setBanned(boolean z) {
        this.isBanned = z;
    }

    public final void setBlockListAddedDate(long j2) {
        this.blockListAddedDate = j2;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setCollectionCount(int i2) {
        this.collectionCount = i2;
    }

    public final void setCommentCount(int i2) {
        this.commentCount = i2;
    }

    public final void setCommentNotificationsEnabled(boolean z) {
        this.isCommentNotificationsEnabled = z;
    }

    public final void setCompletedCount(int i2) {
        this.completedCount = i2;
    }

    public final void setCountsHidden(boolean z) {
        this.isCountsHidden = z;
    }

    public final void setDiscordPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.discordPage = str;
    }

    public final void setDroppedCount(int i2) {
        this.droppedCount = i2;
    }

    public final void setEpisodeNotificationsEnabled(boolean z) {
        this.isEpisodeNotificationsEnabled = z;
    }

    public final void setFavoriteCount(int i2) {
        this.favoriteCount = i2;
    }

    public final void setFirstEpisodeNotificationEnabled(boolean z) {
        this.isFirstEpisodeNotificationEnabled = z;
    }

    public final void setFriendCount(int i2) {
        this.friendCount = i2;
    }

    public final void setFriendRequestsDisallowed(boolean z) {
        this.isFriendRequestsDisallowed = z;
    }

    public final void setFriendStatus(@Nullable Integer num) {
        this.friendStatus = num;
    }

    public final void setGoogleBound(boolean z) {
        this.isGoogleBound = z;
    }

    public final void setHistory(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.history = list;
    }

    public final void setHoldOnCount(int i2) {
        this.holdOnCount = i2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setInstPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.instPage = str;
    }

    public final void setLastActivityTime(long j2) {
        this.lastActivityTime = j2;
    }

    public final void setLogin(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.login = str;
    }

    public final void setLoginChanged(boolean z) {
        this.isLoginChanged = z;
    }

    public final void setMeBlocked(boolean z) {
        this.isMeBlocked = z;
    }

    public final void setOnline(boolean z) {
        this.isOnline = z;
    }

    public final void setPassword(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.password = str;
    }

    public final void setPermBanned(boolean z) {
        this.isPermBanned = z;
    }

    public final void setPlanCount(int i2) {
        this.planCount = i2;
    }

    public final void setPrivilegeLevel(long j2) {
        this.privilegeLevel = j2;
    }

    public final void setProfileToken(@NotNull ProfileToken profileToken) {
        Intrinsics.m32179h(profileToken, "<set-?>");
        this.profileToken = profileToken;
    }

    public final void setRatingScore(int i2) {
        this.ratingScore = i2;
    }

    public final void setRegisterDate(long j2) {
        this.registerDate = j2;
    }

    public final void setRoles(@NotNull List<Role> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.roles = list;
    }

    public final void setSocial(boolean z) {
        this.isSocial = z;
    }

    public final void setSocialHidden(boolean z) {
        this.isSocialHidden = z;
    }

    public final void setSponsor(boolean z) {
        this.isSponsor = z;
    }

    public final void setSponsorshipExpires(long j2) {
        this.sponsorshipExpires = j2;
    }

    public final void setStatsHidden(boolean z) {
        this.isStatsHidden = z;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.status = str;
    }

    public final void setTgPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.tgPage = str;
    }

    public final void setTtPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.ttPage = str;
    }

    public final void setVerified(boolean z) {
        this.isVerified = z;
    }

    public final void setVideoCount(int i2) {
        this.videoCount = i2;
    }

    public final void setVkBound(boolean z) {
        this.isVkBound = z;
    }

    public final void setVkPage(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.vkPage = str;
    }

    public final void setVote(int i2) {
        this.vote = i2;
    }

    public final void setVotes(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.votes = list;
    }

    public final void setWatchDynamics(@NotNull List<ProfileWatchDynamics> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.watchDynamics = list;
    }

    public final void setWatchedEpisodeCount(long j2) {
        this.watchedEpisodeCount = j2;
    }

    public final void setWatchedTime(long j2) {
        this.watchedTime = j2;
    }

    public final void setWatchingCount(int i2) {
        this.watchingCount = i2;
    }
}
