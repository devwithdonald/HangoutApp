import { TestBed } from '@angular/core/testing';

import { LoggedInUserService } from './logged-in-user.service';

describe('LoggedInUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LoggedInUserService = TestBed.get(LoggedInUserService);
    expect(service).toBeTruthy();
  });
});
