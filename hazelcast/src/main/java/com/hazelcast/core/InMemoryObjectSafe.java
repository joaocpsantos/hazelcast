package com.hazelcast.core;

import com.hazelcast.map.EntryProcessor;

/**
 * Allows notifying Hazelcast that the processing unit implementing can execute over the in-memory object without clone.
 * This marker interface allows optimizing the processing to gain more performance.
 *
 * Currently supported in:
 * <ul>
 * <li>{@link EntryProcessor} passed to {@link IMap#executeOnKey(Object, EntryProcessor)}</li>
 * <li>{@link EntryProcessor} passed to {@link IMap#submitToKey(Object, EntryProcessor)} </li>
 * <li>{@link EntryProcessor} passed to {@link IMap#submitToKey(Object, EntryProcessor, ExecutionCallback)} </li>
 * </ul>
 *
 * @see Offloadable
 */
public interface InMemoryObjectSafe {
}
