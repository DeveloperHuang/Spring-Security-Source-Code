/* Copyright 2004 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sf.acegisecurity.providers.dao.cache;

import net.sf.acegisecurity.providers.dao.User;
import net.sf.acegisecurity.providers.dao.UserCache;


/**
 * Does not perform any caching.
 *
 * @author Ben Alex
 * @version $Id$
 */
public class NullUserCache implements UserCache {
    //~ Methods ================================================================

    public User getUserFromCache(String username) {
        return null;
    }

    public void putUserInCache(User user) {}
}
