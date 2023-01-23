import { TestBed } from '@angular/core/testing';

import { CactivateGuard } from './cactivate.guard';

describe('CactivateGuard', () => {
  let guard: CactivateGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(CactivateGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
