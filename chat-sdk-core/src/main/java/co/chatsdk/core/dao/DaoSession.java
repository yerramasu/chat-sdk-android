package co.chatsdk.core.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import co.chatsdk.core.dao.Message;
import co.chatsdk.core.dao.UserThreadLink;
import co.chatsdk.core.dao.User;
import co.chatsdk.core.dao.LinkedAccount;
import co.chatsdk.core.dao.FollowerLink;
import co.chatsdk.core.dao.ContactLink;
import co.chatsdk.core.dao.Thread;
import co.chatsdk.core.dao.ReadReceiptUserLink;
import co.chatsdk.core.dao.ThreadMetaValue;

import co.chatsdk.core.dao.MessageDao;
import co.chatsdk.core.dao.UserThreadLinkDao;
import co.chatsdk.core.dao.UserDao;
import co.chatsdk.core.dao.LinkedAccountDao;
import co.chatsdk.core.dao.FollowerLinkDao;
import co.chatsdk.core.dao.ContactLinkDao;
import co.chatsdk.core.dao.ThreadDao;
import co.chatsdk.core.dao.ReadReceiptUserLinkDao;
import co.chatsdk.core.dao.ThreadMetaValueDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig messageDaoConfig;
    private final DaoConfig userThreadLinkDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig linkedAccountDaoConfig;
    private final DaoConfig followerLinkDaoConfig;
    private final DaoConfig contactLinkDaoConfig;
    private final DaoConfig threadDaoConfig;
    private final DaoConfig readReceiptUserLinkDaoConfig;
    private final DaoConfig threadMetaValueDaoConfig;

    private final MessageDao messageDao;
    private final UserThreadLinkDao userThreadLinkDao;
    private final UserDao userDao;
    private final LinkedAccountDao linkedAccountDao;
    private final FollowerLinkDao followerLinkDao;
    private final ContactLinkDao contactLinkDao;
    private final ThreadDao threadDao;
    private final ReadReceiptUserLinkDao readReceiptUserLinkDao;
    private final ThreadMetaValueDao threadMetaValueDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        messageDaoConfig = daoConfigMap.get(MessageDao.class).clone();
        messageDaoConfig.initIdentityScope(type);

        userThreadLinkDaoConfig = daoConfigMap.get(UserThreadLinkDao.class).clone();
        userThreadLinkDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        linkedAccountDaoConfig = daoConfigMap.get(LinkedAccountDao.class).clone();
        linkedAccountDaoConfig.initIdentityScope(type);

        followerLinkDaoConfig = daoConfigMap.get(FollowerLinkDao.class).clone();
        followerLinkDaoConfig.initIdentityScope(type);

        contactLinkDaoConfig = daoConfigMap.get(ContactLinkDao.class).clone();
        contactLinkDaoConfig.initIdentityScope(type);

        threadDaoConfig = daoConfigMap.get(ThreadDao.class).clone();
        threadDaoConfig.initIdentityScope(type);

        readReceiptUserLinkDaoConfig = daoConfigMap.get(ReadReceiptUserLinkDao.class).clone();
        readReceiptUserLinkDaoConfig.initIdentityScope(type);

        threadMetaValueDaoConfig = daoConfigMap.get(ThreadMetaValueDao.class).clone();
        threadMetaValueDaoConfig.initIdentityScope(type);

        messageDao = new MessageDao(messageDaoConfig, this);
        userThreadLinkDao = new UserThreadLinkDao(userThreadLinkDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        linkedAccountDao = new LinkedAccountDao(linkedAccountDaoConfig, this);
        followerLinkDao = new FollowerLinkDao(followerLinkDaoConfig, this);
        contactLinkDao = new ContactLinkDao(contactLinkDaoConfig, this);
        threadDao = new ThreadDao(threadDaoConfig, this);
        readReceiptUserLinkDao = new ReadReceiptUserLinkDao(readReceiptUserLinkDaoConfig, this);
        threadMetaValueDao = new ThreadMetaValueDao(threadMetaValueDaoConfig, this);

        registerDao(Message.class, messageDao);
        registerDao(UserThreadLink.class, userThreadLinkDao);
        registerDao(User.class, userDao);
        registerDao(LinkedAccount.class, linkedAccountDao);
        registerDao(FollowerLink.class, followerLinkDao);
        registerDao(ContactLink.class, contactLinkDao);
        registerDao(Thread.class, threadDao);
        registerDao(ReadReceiptUserLink.class, readReceiptUserLinkDao);
        registerDao(ThreadMetaValue.class, threadMetaValueDao);
    }
    
    public void clear() {
        messageDaoConfig.clearIdentityScope();
        userThreadLinkDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        linkedAccountDaoConfig.clearIdentityScope();
        followerLinkDaoConfig.clearIdentityScope();
        contactLinkDaoConfig.clearIdentityScope();
        threadDaoConfig.clearIdentityScope();
        readReceiptUserLinkDaoConfig.clearIdentityScope();
        threadMetaValueDaoConfig.clearIdentityScope();
    }

    public MessageDao getMessageDao() {
        return messageDao;
    }

    public UserThreadLinkDao getUserThreadLinkDao() {
        return userThreadLinkDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public LinkedAccountDao getLinkedAccountDao() {
        return linkedAccountDao;
    }

    public FollowerLinkDao getFollowerLinkDao() {
        return followerLinkDao;
    }

    public ContactLinkDao getContactLinkDao() {
        return contactLinkDao;
    }

    public ThreadDao getThreadDao() {
        return threadDao;
    }

    public ReadReceiptUserLinkDao getReadReceiptUserLinkDao() {
        return readReceiptUserLinkDao;
    }

    public ThreadMetaValueDao getThreadMetaValueDao() {
        return threadMetaValueDao;
    }

}
